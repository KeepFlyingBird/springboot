package cn.freefly.springboot.httpClientUtil.service.gj.impl;

import cn.freefly.springboot.devUtils.DateUtil;
import cn.freefly.springboot.devUtils.JsonUtil;
import cn.freefly.springboot.httpClientUtil.config.PathConfig;
import cn.freefly.springboot.httpClientUtil.config.gj.ChannelGjFundModeConfig;
import cn.freefly.springboot.httpClientUtil.config.gj.GjChannelConfig;
import cn.freefly.springboot.httpClientUtil.config.gj.GjFundPathConfig;
import cn.freefly.springboot.httpClientUtil.config.gj.GjFundServerConfig;
import cn.freefly.springboot.httpClientUtil.dto.BaseResponse;
import cn.freefly.springboot.httpClientUtil.dto.gj.enums.GjOrderStatusE;
import cn.freefly.springboot.httpClientUtil.dto.gj.enums.ResFlagE;
import cn.freefly.springboot.httpClientUtil.dto.gj.enums.ResponseCode;
import cn.freefly.springboot.httpClientUtil.dto.gj.order.Order;
import cn.freefly.springboot.httpClientUtil.dto.gj.order.OrderRequest;
import cn.freefly.springboot.httpClientUtil.dto.gj.order.OrderResponse;
import cn.freefly.springboot.httpClientUtil.dto.gj.order.channel.ChannelOrderRequest;
import cn.freefly.springboot.httpClientUtil.entity.gj.CacmpGjOrder;
import cn.freefly.springboot.httpClientUtil.mapper.gj.CacmpGjOrderMapper;
import cn.freefly.springboot.httpClientUtil.service.PathConfigService;
import cn.freefly.springboot.httpClientUtil.service.gj.CacmpGjNodeService;
import cn.freefly.springboot.httpClientUtil.service.gj.OrderService;

import cn.freefly.springboot.httpClientUtil.util.UniquenessFlagUnits;
import cn.freefly.springboot.httpClientUtil.util.gj.GjHttpClient;
import cn.freefly.springboot.httpClientUtil.util.gj.GjResponse;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Objects;

/**
 * @ClassNmae OrderServiceImpl
 * @Description 进件业务类
 * @Author houjianhui
 * @Date 2020/2/26 21:30
 * @Version 1.0
 **/
@Service
@Slf4j
public class OrderServiceImpl implements OrderService {

    @Autowired
    private CacmpGjOrderMapper cacmpGjOrderMapper;

    @Autowired
    private GjHttpClient gjHttpClients;

    @Autowired
    private PathConfigService pathConfigService;

    @Autowired
    private CacmpGjNodeService cacmpGjNodeService;

    @Override
    @Transactional
    public BaseResponse createOrder(ChannelOrderRequest orderRequest) {
        log.info("进件参数：{}", JsonUtil.toJson(orderRequest));

        // 查询渠道配置信息
        String applicationName = orderRequest.getHeader().getApplicationName();
        GjChannelConfig channelConfig = pathConfigService.findGjChannelConfig(applicationName);
        if (Objects.isNull(channelConfig)) {
            log.info("渠道{}配置在平台不存在或者未启动", applicationName);
            return BaseResponse.createBaseResponse(ResFlagE.失败.isFlag(),ResponseCode.CHANNEL_NOT_EXISTED);
        }
        // 获取资方分配渠道信息
        ChannelGjFundModeConfig fundModeConfig = channelConfig.getFundModeConfig();

        // 构建请求对象
        OrderRequest request = new OrderRequest();
        request.setProductCode(fundModeConfig.getProductCode());
        request.setProductSeriesCode(fundModeConfig.getProductSeriesCode());

        // 查询资方配置信息
        GjFundPathConfig fundPathConfig = pathConfigService.findGjFundPathConfig(channelConfig.getFundCode());
        if (Objects.isNull(fundPathConfig)) {
            log.info("资金方{}配置在平台不存在或者未启动", channelConfig.getFundCode());
            return BaseResponse.createBaseResponse(ResFlagE.失败.isFlag(),ResponseCode.FUND_NOT_EXISTED);
        }

        // 获取渠道名称
        PathConfig value = pathConfigService.findValue(applicationName);

        // 国金资金方配置
        GjFundServerConfig serverConfig = fundPathConfig.getServerConfig();

        String result = gjHttpClients.post(serverConfig.getCreateOrderUrl(), request, fundModeConfig, serverConfig);
        GjResponse<OrderResponse<Order>> response = JSON.parseObject(result, new TypeReference<GjResponse<OrderResponse<Order>>>() {});
        if (response.isSuccess()) {
            Order flow = response.getData().getFlow();
            // 创建订单数据
            CacmpGjOrder order = new CacmpGjOrder();
            String orderId = UniquenessFlagUnits.generateUniquenessFlag("GJ");
            flow.setOrderId(orderId);
            order.setId(orderId);
            order.setCreateTime(DateUtil.getCurTimeSlashYmdHms());
            order.setProductCode(fundModeConfig.getProductCode());
            order.setProductSeriesCode(fundModeConfig.getProductSeriesCode());
            order.setChannelKey(applicationName);
            order.setChannelName(value.getName());
            order.setStatusCode(GjOrderStatusE.初始化订单成功.getCode());
            order.setStatusMessage(GjOrderStatusE.初始化订单成功.getMessage());
            // 保存订单信息
            cacmpGjOrderMapper.insert(order);
            // 保存流程节点
            cacmpGjNodeService.saveNodeInfo(orderId, flow.getInstNo(), flow.getNodeNo());
            return BaseResponse.createBaseResponse(ResFlagE.成功.isFlag(),ResponseCode.SUCCESS.getCode(), response.getMessage(), response.getData());
        } else {
            return BaseResponse.createBaseResponse(ResFlagE.失败.isFlag(),ResponseCode.RESPONSE_ERROR.getCode(), response.getMessage());
        }
    }

    @Override
    public CacmpGjOrder findOrderInfoById(String orderId) {
        log.info("查询订单信息参数：{}", orderId);
        if (Objects.isNull(orderId)) {
            return null;
        }
        return cacmpGjOrderMapper.selectByPrimaryKey(orderId);
    }

    @Override
    public void modifyOrderStatus(String orderId, GjOrderStatusE orderStatus) {
        log.info("修改订单状态参数orderId：{}，orderStatusCode：{}", orderId, orderStatus.getCode());
        CacmpGjOrder order = findOrderInfoById(orderId);
        if (Objects.nonNull(order)) {
            order.setStatusCode(orderStatus.getCode());
            order.setStatusMessage(orderStatus.getMessage());
            cacmpGjOrderMapper.updateByPrimaryKeySelective(order);
        }
    }
}
