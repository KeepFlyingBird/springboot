package cn.freefly.springboot.httpClientUtil.service.gj.impl;

import cn.freefly.springboot.devUtils.JsonUtil;
import cn.freefly.springboot.httpClientUtil.config.ProvinceCityConfig;
import cn.freefly.springboot.httpClientUtil.config.gj.GjChannelConfig;
import cn.freefly.springboot.httpClientUtil.config.gj.GjFundServerConfig;
import cn.freefly.springboot.httpClientUtil.dto.BaseResponse;
import cn.freefly.springboot.httpClientUtil.dto.gj.customer.CustomerAssetCarExtend;
import cn.freefly.springboot.httpClientUtil.dto.gj.customer.CustomerBusiExtend;
import cn.freefly.springboot.httpClientUtil.dto.gj.customer.CustomerSubjectPerson;
import cn.freefly.springboot.httpClientUtil.dto.gj.customer.channel.ChannelCustomerAssetCarExtend;
import cn.freefly.springboot.httpClientUtil.dto.gj.customer.channel.ChannelCustomerBusiExtend;
import cn.freefly.springboot.httpClientUtil.dto.gj.customer.channel.ChannelCustomerSubjectPerson;
import cn.freefly.springboot.httpClientUtil.dto.gj.enums.*;
import cn.freefly.springboot.httpClientUtil.dto.gj.customer.CustomerRegisterRequest;
import cn.freefly.springboot.httpClientUtil.dto.gj.customer.channel.ChannelCustomerRequest;
import cn.freefly.springboot.httpClientUtil.entity.gj.CacmpGjFile;
import cn.freefly.springboot.httpClientUtil.entity.gj.CacmpGjNode;
import cn.freefly.springboot.httpClientUtil.entity.gj.CacmpGjOrder;
import cn.freefly.springboot.httpClientUtil.mapper.ProvinceCityMapper;
import cn.freefly.springboot.httpClientUtil.service.PathConfigService;
import cn.freefly.springboot.httpClientUtil.service.gj.CacmpGjNodeService;
import cn.freefly.springboot.httpClientUtil.service.gj.CustomerRegisterService;
import cn.freefly.springboot.httpClientUtil.service.gj.OrderService;
import cn.freefly.springboot.httpClientUtil.service.gj.async.GjPlatformAsyncService;
import cn.freefly.springboot.httpClientUtil.service.gj.persistence.GjFileService;
import cn.freefly.springboot.httpClientUtil.util.gj.GjHttpClient;
import cn.freefly.springboot.httpClientUtil.util.gj.GjResponse;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

/**
 * @ClassNmae CustomerRegisterServiceImpl
 * @Description 客户登记业务类
 * @Author houjianhui
 * @Date 2020/2/27 10:33
 * @Version 1.0
 **/
@Service
@Slf4j
public class CustomerRegisterServiceImpl implements CustomerRegisterService {
    @Autowired
    private GjHttpClient gjHttpClient;
    @Autowired
    private OrderService orderService;
    @Autowired
    private PathConfigService pathConfigService;
    @Autowired
    private CacmpGjNodeService cacmpGjNodeService;
    @Autowired
    private GjFileService gjFileService;
    @Autowired
    private GjPlatformAsyncService gjPlatformAsyncService;
    @Autowired
    private ProvinceCityMapper provinceCityMapper;

    @Override
    public BaseResponse saveCustomerInfo(ChannelCustomerRequest customerRequest) {
        log.info("客户登记参数：{}", JsonUtil.toJson(customerRequest));
        String applicationName = customerRequest.getHeader().getApplicationName();
        String orderId = customerRequest.getOrderId();
        if (Objects.isNull(orderId)) {
            log.info("订单唯一标识为空");
            return BaseResponse.createBaseResponse(ResFlagE.失败.isFlag(),ResponseCode.ARGUMENT_CHECK_FAILED);
        }
        GjChannelConfig channelConfig = pathConfigService.findGjChannelConfig(applicationName);
        if (Objects.isNull(channelConfig)) {
            log.info("渠道{}配置在平台不存在或者未启动", applicationName);
            return BaseResponse.createBaseResponse(ResFlagE.失败.isFlag(),ResponseCode.CHANNEL_NOT_EXISTED);
        }
        // 查询订单状态
        CacmpGjOrder order = orderService.findOrderInfoById(orderId);
        if (Objects.isNull(order)) {
            log.info("订单号[{}]信息在平台不存在", orderId);
            return BaseResponse.createBaseResponse(ResFlagE.失败.isFlag(),ResponseCode.CHANNEL_ORDER_NOT_EXIST);
        }
        if (!Objects.equals(GjOrderStatusE.初始化订单成功.getCode(), order.getStatusCode()) && !Objects.equals(GjOrderStatusE.客户登记受理失败.getCode(), order.getStatusCode())) {
            log.info("订单号[{}]不可发起客户登记", orderId);
            return BaseResponse.createBaseResponse(ResFlagE.失败.isFlag(),ResponseCode.CHANNEL_CUSTOMER_REGISTER_NOT_APPLY);
        }
        CustomerRegisterRequest customerRegisterRequest = builderCustomerRegisterRequestModel(customerRequest);
        if (Objects.isNull(customerRegisterRequest)) {
            log.info("客户登记申请缺少影像资料");
            return BaseResponse.createBaseResponse(ResFlagE.失败.isFlag(),ResponseCode.CHANNEL_CUSTOMER_REGISTER_ATTACH_NOT_EXIST);
        }
        // 查询资方配置信息
        GjFundServerConfig fundService = pathConfigService.findGjFundService(applicationName);
        BaseResponse response = gjHttpClient.post(fundService.getSaveApiUrl(), customerRegisterRequest, applicationName, fundService);
        if (Objects.equals(ResponseCode.SUCCESS.getCode(), response.getResCode())) {
            Object data = response.getResData();
            GjResponse<Object> gjResponse = JSON.parseObject(data.toString(), new TypeReference<GjResponse<Object>>() {
            });
            if (gjResponse.isSuccess()) {
                // 保存客户登记信息
                gjPlatformAsyncService.saveCustomerRegister(orderId, customerRegisterRequest);
                response = BaseResponse.createBaseResponse(ResFlagE.成功.isFlag(),ResponseCode.SUCCESS);
            } else {
                response = BaseResponse.createBaseResponse(ResFlagE.失败.isFlag(),ResponseCode.RESPONSE_ERROR.getCode(), gjResponse.getMessage());
                // 修改订单状态
                orderService.modifyOrderStatus(orderId, GjOrderStatusE.客户登记受理成功);
            }
        } else {
            // 修改订单状态
            orderService.modifyOrderStatus(orderId, GjOrderStatusE.客户登记受理失败);
        }
        return response;
    }

    private CustomerRegisterRequest builderCustomerRegisterRequestModel(ChannelCustomerRequest channelCustomerRequest) {
        String orderId = channelCustomerRequest.getOrderId();
        // 查询订单当前节点
        CacmpGjNode currentNode = cacmpGjNodeService.findCurrentNode(orderId);

        CustomerRegisterRequest customerRequest = new CustomerRegisterRequest();
        customerRequest.setInstNo(currentNode.getInstNo());
        customerRequest.setNodeNo(currentNode.getNodeNo());

        ChannelCustomerAssetCarExtend carExtend = channelCustomerRequest.getAssetCarExtend();
        CustomerAssetCarExtend assetCarExtend = new CustomerAssetCarExtend();
        assetCarExtend.setOldCarPlate(carExtend.getOldCarPlate());

        ChannelCustomerBusiExtend businessExtend = channelCustomerRequest.getBusinessExtend();

        ProvinceCityConfig cityConfig = provinceCityMapper.findByProvinceCityCounty(businessExtend.getBusiProvinceName(), businessExtend.getBusiCityName(), businessExtend.getBusiDistrictName());
        if (Objects.isNull(cityConfig)) {
            log.info("通过省：{}，市：{}，县：{}未匹配到国金区域信息", businessExtend.getBusiProvinceName(), businessExtend.getBusiCityName(), businessExtend.getBusiDistrictName());
        }
        CustomerBusiExtend busiExtend = new CustomerBusiExtend();
        busiExtend.setBusiAddress(businessExtend.getBusiAddress()); //业务发生地(详细地址)
        busiExtend.setBusiCity(cityConfig.getCity()); //业务发生地(市级地址)
        busiExtend.setBusiCityName(cityConfig.getGjCityCode()); //业务发生地(市级地址编码)
        busiExtend.setBusiDistrict(cityConfig.getCountry()); //业务发生地(区级地址)
        busiExtend.setBusiDistrictName(cityConfig.getGjCountyCode()); //业务发生地(区级地址编码)
        busiExtend.setBusiProvince(cityConfig.getProvince()); //业务发生地(省级地址)
        busiExtend.setBusiProvinceName(cityConfig.getGjProvinceCode()); //业务发生地(省级地址编码)
        busiExtend.setBusiLng(businessExtend.getBusiLng());
        busiExtend.setBusiLat(businessExtend.getBusiLat());

        ChannelCustomerSubjectPerson customerSubjectPerson = channelCustomerRequest.getSubjectPerson();
        CustomerSubjectPerson subjectPerson = new CustomerSubjectPerson();
        subjectPerson.setSubPhone(customerSubjectPerson.getSubPhone());
        subjectPerson.setMarriageState(customerSubjectPerson.getMarriageState());

        // 查询文件信息
        List<CacmpGjFile> cacmpGjFiles = gjFileService.listGjFileByStage(orderId, UploadFieldEnum.PRETRIAL.getCode() + "");
        if (CollectionUtils.isEmpty(cacmpGjFiles)) {
            log.error("请先上传影像资料在发起客户登记申请");
            return null;
        }
        Optional<CacmpGjFile> cardFrontFic = cacmpGjFiles.stream().filter(v -> Objects.equals(v.getFileName(), GJFieldEnum.身份证正面照.name())).findFirst();
        if (cardFrontFic.isPresent()) {
            subjectPerson.setIdCardFrontFic(cardFrontFic.get().getFastdfsUrl());
        }
        Optional<CacmpGjFile> cardHeadPhoto = cacmpGjFiles.stream().filter(v -> Objects.equals(v.getFileName(), GJFieldEnum.身份证正面照.name())).findFirst();
        if (cardHeadPhoto.isPresent()) {
            subjectPerson.setIdCardHeadPhoto(cardHeadPhoto.get().getFastdfsUrl());
        }
        Optional<CacmpGjFile> cardReverseFic = cacmpGjFiles.stream().filter(v -> Objects.equals(v.getFileName(), GJFieldEnum.身份证反面照.name())).findFirst();
        if (cardReverseFic.isPresent()) {
            subjectPerson.setIdCardReverseFic(cardReverseFic.get().getFastdfsUrl());
        }
        customerRequest.setfAssetCarExtend(assetCarExtend);
        customerRequest.setfSubjectPerson(subjectPerson);
        customerRequest.setfBusiExtend(busiExtend);
        return customerRequest;
    }
}
