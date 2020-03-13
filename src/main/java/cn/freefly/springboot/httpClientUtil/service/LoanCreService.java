package cn.freefly.springboot.httpClientUtil.service;

import cn.freefly.springboot.httpClientUtil.dto.BaseResponse;
import cn.freefly.springboot.httpClientUtil.dto.loanCre.channel.ChannelLoanCreApplyRequest;
import cn.freefly.springboot.httpClientUtil.dto.pretrial.channel.ChannelPretrialApplyRequest;

public interface LoanCreService {
    BaseResponse loanCreApply(ChannelLoanCreApplyRequest channelLoanCreApplyRequest);
}
