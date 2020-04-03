package cn.freefly.springboot.httpClientUtil.service.gj;

import cn.freefly.springboot.httpClientUtil.dto.BaseResponse;
import cn.freefly.springboot.httpClientUtil.dto.gj.customer.channel.ChannelCustomerRequest;

public interface CustomerRegisterService {

    /**
     * @Author houjianhui
     * @Description 客户登记
     * @Date 17:33 2020/2/28
     * @Param [customerRequest]
     * @return com.jianyuan.fund.web.dto.BaseResponse
     **/
    BaseResponse saveCustomerInfo(ChannelCustomerRequest customerRequest);
}
