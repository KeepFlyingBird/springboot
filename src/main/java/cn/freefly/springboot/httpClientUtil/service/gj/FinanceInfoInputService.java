package cn.freefly.springboot.httpClientUtil.service.gj;

import cn.freefly.springboot.httpClientUtil.dto.BaseResponse;
import cn.freefly.springboot.httpClientUtil.dto.gj.financeInfo.channel.ChannelFinanceInfoInputRequest;

/**
 * @Author xiao.yunfei
 * @Date 2020/2/27 10:06
 * @MethodParameters
 * @Description 国金-融资信息录入
*/
public interface FinanceInfoInputService {
    /**
     * @Author xiao.yunfei
     * @Description 融资信息录入
     * @Date 2020/3/28 22:57
     * @Param [infoInputRequest]
     * @Return com.jianyuan.fund.web.dto.BaseResponse
     */
    BaseResponse saveFinanceInfo(ChannelFinanceInfoInputRequest infoInputRequest);
}
