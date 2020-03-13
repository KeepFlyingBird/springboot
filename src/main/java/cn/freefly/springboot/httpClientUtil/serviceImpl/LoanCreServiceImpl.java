package cn.freefly.springboot.httpClientUtil.serviceImpl;

import cn.freefly.springboot.httpClientUtil.dto.BaseResponse;
import cn.freefly.springboot.httpClientUtil.dto.enums.ResponseEnum;
import cn.freefly.springboot.httpClientUtil.dto.loanCre.channel.ChannelLoanCreApplyRequest;
import cn.freefly.springboot.httpClientUtil.service.LoanCreService;
import org.springframework.scheduling.annotation.Async;

/**
 * @ClassNmae LoanCreServiceImpl
 * @Author xiao.yunfei
 * @Date 2020/3/12 22:26
 * @Desc
 */
public class LoanCreServiceImpl implements LoanCreService {

    @Override
    public BaseResponse loanCreApply(ChannelLoanCreApplyRequest channelLoanCreApplyRequest) {
        //1、条件校验:检查是否满足请求条件

        //2、保存请求数据

        //3、异步调资方接口
        syncPushLoanCreApply(channelLoanCreApplyRequest);
        //4、实时响应资产方
        return BaseResponse.createBaseResponse(true, ResponseEnum.Success.getCode(),ResponseEnum.Success.getMsg());
    }

    @Async
    public void syncPushLoanCreApply(ChannelLoanCreApplyRequest channelLoanCreApplyRequest) {
        //1、构建请求参数
        //2、调资方接口
        //3、通知资产方
    }
}
