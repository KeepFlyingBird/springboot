package cn.freefly.springboot.httpClientUtil.service.gj.impl;

import cn.freefly.springboot.devUtils.JsonUtil;
import cn.freefly.springboot.httpClientUtil.config.gj.GjChannelConfig;
import cn.freefly.springboot.httpClientUtil.config.gj.GjFundServerConfig;
import cn.freefly.springboot.httpClientUtil.dto.BaseResponse;
import cn.freefly.springboot.httpClientUtil.dto.gj.bankCard.PersonBank;
import cn.freefly.springboot.httpClientUtil.dto.gj.bankCard.PersonBankRequest;
import cn.freefly.springboot.httpClientUtil.dto.gj.bankCard.channel.ChannelPersonBank;
import cn.freefly.springboot.httpClientUtil.dto.gj.bankCard.channel.ChannelPersonBankRequest;
import cn.freefly.springboot.httpClientUtil.dto.gj.enums.EnumProcessNode;
import cn.freefly.springboot.httpClientUtil.dto.gj.enums.GjOrderStatusE;
import cn.freefly.springboot.httpClientUtil.dto.gj.enums.ResFlagE;
import cn.freefly.springboot.httpClientUtil.dto.gj.enums.ResponseCode;
import cn.freefly.springboot.httpClientUtil.entity.gj.CacmpGjNode;
import cn.freefly.springboot.httpClientUtil.entity.gj.CacmpGjOrder;
import cn.freefly.springboot.httpClientUtil.mapper.gj.CacmpGjPersonBankMapper;
import cn.freefly.springboot.httpClientUtil.service.PathConfigService;
import cn.freefly.springboot.httpClientUtil.service.gj.CacmpGjNodeService;
import cn.freefly.springboot.httpClientUtil.service.gj.OrderService;
import cn.freefly.springboot.httpClientUtil.service.gj.PersonBankService;
import cn.freefly.springboot.httpClientUtil.service.gj.async.GjPlatformAsyncService;
import cn.freefly.springboot.httpClientUtil.util.gj.GjHttpClient;
import cn.freefly.springboot.httpClientUtil.util.gj.GjResponse;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/**
 * @ClassNmae PersonBankServiceImpl
 * @Author xiao.yunfei
 * @Date 2020/2/27 17:48
 * @Desc
 */
@Service
@Slf4j
public class PersonBankServiceImpl implements PersonBankService {
    @Autowired
    private GjHttpClient gjHttpClient;
    @Autowired
    private PathConfigService pathConfigService;
    @Autowired
    private CacmpGjNodeService cacmpGjNodeService;
    @Autowired
    private CacmpGjPersonBankMapper cacmpGjPersonBankMapper;
    @Autowired
    private GjPlatformAsyncService gjPlatformAsyncService;
    @Autowired
    private OrderService orderService;

    @Override
    @Transactional
    public BaseResponse bindBankCard(ChannelPersonBankRequest personBankRequest) {
        log.info("银行卡绑定接口请求报文：{}", JsonUtil.toJson(personBankRequest));
        //1、数据校验
        String orderId = personBankRequest.getOrderId();
        if (Objects.isNull(orderId)) {
            log.info("银行卡绑定接口:订单唯一标识为空");
            return BaseResponse.createBaseResponse(ResFlagE.失败.isFlag(), ResponseCode.ARGUMENT_CHECK_FAILED);
        }
        String applicationName = personBankRequest.getHeader().getApplicationName();
        GjChannelConfig channelConfig = pathConfigService.findGjChannelConfig(applicationName);
        if (Objects.isNull(channelConfig)) {
            log.info("银行卡绑定接口：渠道{}配置在平台不存在或者未启动", applicationName);
            return BaseResponse.createBaseResponse(ResFlagE.失败.isFlag(),ResponseCode.CHANNEL_NOT_EXISTED);
        }
        CacmpGjOrder order = orderService.findOrderInfoById(orderId);
        if (Objects.isNull(order)) {
            log.info("银行卡绑定接口：订单号[{}]信息在平台不存在", orderId);
            return BaseResponse.createBaseResponse(ResFlagE.失败.isFlag(),ResponseCode.CHANNEL_ORDER_NOT_EXIST);
        }
        List<String> statusCodeList = Arrays.asList(GjOrderStatusE.客户登记回调成功.getCode(), GjOrderStatusE.银行卡绑卡失败.getCode()
        , GjOrderStatusE.银行卡绑卡验证码回填失败.getCode());
        if(!statusCodeList.contains(order.getStatusCode())){
            log.info("订单号：[{}]，不可发起银行卡绑定接口", orderId);
            return BaseResponse.createBaseResponse(ResFlagE.失败.isFlag(),ResponseCode.CHANNEL_BANK_CARD_BIND_APPLY);
        }
        CacmpGjNode cacmpGjNode = cacmpGjNodeService.findCurrentNode(orderId);
        log.info("订单号：[{}]，当前业务编号nodeNo：[{}]",orderId,cacmpGjNode.getNodeNo());
        if (Objects.isNull(cacmpGjNode.getNodeNo())
        || !Objects.equals(cacmpGjNode.getNodeNo(), EnumProcessNode.FINANACE_INFO_INPUT.getCode())) {
            return BaseResponse.createBaseResponse(ResFlagE.失败.isFlag(),ResponseCode.NODE_NO_MATCH);
        }
        GjFundServerConfig fundService = pathConfigService.findGjFundService(applicationName);
        if (Objects.isNull(fundService)) {
            log.info("资金方配置在平台不存在或者未启动");
            return BaseResponse.createBaseResponse(ResFlagE.失败.isFlag(),ResponseCode.FUND_NOT_EXISTED);
        }

        //2、组装请求资方参数
        PersonBankRequest request = buildPersonBankRequestModel(personBankRequest);
        //3、资方接口调用
        BaseResponse response = gjHttpClient.post(fundService.getBindBankCardUrl(), request, applicationName, fundService);
        if (Objects.equals(ResponseCode.SUCCESS.getCode(), response.getResCode())) {
            Object data = response.getResData();
            GjResponse<Object> gjResponse = JSON.parseObject(data.toString(), new TypeReference<GjResponse<Object>>() {
            });
            if (gjResponse.isSuccess()) {
                //4、平台业务逻辑处理-保存银行卡信息
                gjPlatformAsyncService.bindBankCardHandle(personBankRequest);
                response = BaseResponse.createBaseResponse(ResFlagE.失败.isFlag(),ResponseCode.SUCCESS);
            } else {
                response = BaseResponse.createBaseResponse(ResFlagE.失败.isFlag(),ResponseCode.RESPONSE_ERROR.getCode(), gjResponse.getMessage());
                // 修改订单状态
                orderService.modifyOrderStatus(orderId, GjOrderStatusE.银行卡绑卡失败);
            }
        } else {
            // 修改订单状态
            orderService.modifyOrderStatus(orderId, GjOrderStatusE.银行卡绑卡失败);
        }
        return response;
    }

    public PersonBankRequest buildPersonBankRequestModel(ChannelPersonBankRequest request) {
        PersonBankRequest personBankRequest = new PersonBankRequest();
        // 查询订单当前节点
        CacmpGjNode currentNode = cacmpGjNodeService.findCurrentNode(request.getOrderId());
        personBankRequest.setInstNo(currentNode.getInstNo());
        personBankRequest.setNodeNo(currentNode.getNodeNo());
        List<PersonBank> personBankList = new ArrayList<PersonBank>();
        List<ChannelPersonBank> channelPersonBankList = request.getfSubjectPerson();
        if(channelPersonBankList != null && channelPersonBankList.size() > 0){
            for(ChannelPersonBank channelPersonBank : channelPersonBankList){
                PersonBank personBank = new PersonBank();
                personBank.setSubName(channelPersonBank.getSubName());
                personBank.setIdCardNumber(channelPersonBank.getIdCardNumber());
                personBank.setSubPhone(channelPersonBank.getSubPhone());
                personBank.setBankAccount(channelPersonBank.getBankAccount());
                personBank.setBankBranchName(channelPersonBank.getBankBranchName());
                personBank.setIsWithholdCard(channelPersonBank.getIsWithholdCard());
                personBankList.add(personBank);
            }
            personBankRequest.setfSubjectPerson(personBankList);
        }
        return personBankRequest;
    }
}
