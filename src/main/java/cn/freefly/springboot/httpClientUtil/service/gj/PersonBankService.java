package cn.freefly.springboot.httpClientUtil.service.gj;


import cn.freefly.springboot.httpClientUtil.dto.BaseResponse;
import cn.freefly.springboot.httpClientUtil.dto.gj.bankCard.channel.ChannelPersonBankRequest;

public interface PersonBankService {
    BaseResponse bindBankCard(ChannelPersonBankRequest personBankRequest);
}
