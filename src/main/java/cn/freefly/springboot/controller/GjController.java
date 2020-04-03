package cn.freefly.springboot.controller;

import cn.freefly.springboot.httpClientUtil.dto.BaseResponse;
import cn.freefly.springboot.httpClientUtil.dto.gj.bankCard.channel.ChannelPersonBankRequest;
import cn.freefly.springboot.httpClientUtil.dto.gj.customer.channel.ChannelCustomerRequest;
import cn.freefly.springboot.httpClientUtil.dto.gj.financeInfo.channel.ChannelFinanceInfoInputRequest;
import cn.freefly.springboot.httpClientUtil.dto.gj.order.channel.ChannelOrderRequest;
import cn.freefly.springboot.httpClientUtil.service.gj.CustomerRegisterService;
import cn.freefly.springboot.httpClientUtil.service.gj.FinanceInfoInputService;
import cn.freefly.springboot.httpClientUtil.service.gj.OrderService;
import cn.freefly.springboot.httpClientUtil.service.gj.PersonBankService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassNmae GjController
 * @Author xiao.yunfei
 * @Date 2020/4/1 22:18
 * @Desc
 */
@RestController
@Api(description = "非履约险-国金", tags = "国金车抵贷接口")
public class GjController {
    @Autowired
    public OrderService orderService;
    @Autowired
    public CustomerRegisterService customerRegisterService;
    @Autowired
    public PersonBankService personBankService;
    @Autowired
    public FinanceInfoInputService financeInfoInputService;

    @ApiOperation(value = "接收进件信息",
            httpMethod = "POST",
            consumes = MediaType.APPLICATION_JSON_UTF8_VALUE,
            produces = MediaType.APPLICATION_JSON_UTF8_VALUE,
            response = BaseResponse.class)
    @PostMapping("/channel/non-insurance-platform/gj/init/order")
    public BaseResponse initOrder(@RequestBody ChannelOrderRequest orderRequest) {
        return orderService.createOrder(orderRequest);
    }

    @ApiOperation(value = "接收客户登记信息",
            httpMethod = "POST",
            consumes = MediaType.APPLICATION_JSON_UTF8_VALUE,
            produces = MediaType.APPLICATION_JSON_UTF8_VALUE,
            response = BaseResponse.class)
    @PostMapping("/channel/non-insurance-platform/gj/customer/register")
    public BaseResponse customerRegister(@RequestBody ChannelCustomerRequest customerRequest) {
        return customerRegisterService.saveCustomerInfo(customerRequest);
    }

    @ApiOperation(value = "银行卡绑定",
            httpMethod = "POST",
            consumes = MediaType.APPLICATION_JSON_UTF8_VALUE,
            produces = MediaType.APPLICATION_JSON_UTF8_VALUE,
            response = BaseResponse.class)
    @PostMapping("/channel/non-insurance-platform/gj/bankCard/bind")
    public BaseResponse bankCardBind(@RequestBody ChannelPersonBankRequest personBankRequest) {
        return personBankService.bindBankCard(personBankRequest);
    }

    @ApiOperation(value = "接收融资信息",
            httpMethod = "POST",
            consumes = MediaType.APPLICATION_JSON_UTF8_VALUE,
            produces = MediaType.APPLICATION_JSON_UTF8_VALUE,
            response = BaseResponse.class)
    @PostMapping("/channel/non-insurance-platform/gj/financeInfo/input")
    public BaseResponse financeInfoInput(@RequestBody ChannelFinanceInfoInputRequest financeInfoInputRequest) {
        return financeInfoInputService.saveFinanceInfo(financeInfoInputRequest);
    }
}
