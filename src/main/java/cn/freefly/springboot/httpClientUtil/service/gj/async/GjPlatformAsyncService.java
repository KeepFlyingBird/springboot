package cn.freefly.springboot.httpClientUtil.service.gj.async;

import cn.freefly.springboot.httpClientUtil.dto.gj.bankCard.channel.ChannelPersonBankRequest;
import cn.freefly.springboot.httpClientUtil.dto.gj.customer.CustomerRegisterRequest;
import cn.freefly.springboot.httpClientUtil.dto.gj.financeInfo.channel.ChannelFinanceInfoInputRequest;
import cn.freefly.springboot.httpClientUtil.util.gj.GjCallBackRequest;

public interface GjPlatformAsyncService {
    /**
     * @Author houjianhui
     * @Description 客户登记异步处理
     * @Date 15:43 2020/3/27
     * @Param [orderId, customerRequest]
     * @return void
     **/
    void saveCustomerRegister(String orderId, CustomerRegisterRequest customerRequest);


    /**
     * @Author xiao.yunfei
     * @Date 2020/3/28 15:52
     * @MethodParameters
     * @Description 融资信息录入异步处理
    */
    void saveFinanceInfoInput(ChannelFinanceInfoInputRequest financeInfoInputRequest);

    /**
     * @Author xiao.yunfei
     * @Description 银行卡绑定异步处理
     * @Date 2020/3/29 15:29
     * @Param [personBankRequest]
     * @Return void
     */
    void bindBankCardHandle(ChannelPersonBankRequest personBankRequest);

    /**
     * @Author xiao.yunfei
     * @Description 资方回调平台后异步处理
     * @Date 2020/4/1 14:40
     * @Param [gjCallBackResponse]
     * @Return void
     */ 
    void callbackHandle(GjCallBackRequest gjCallBackRequest);

}
