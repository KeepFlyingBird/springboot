package cn.freefly.springboot.httpClientUtil.dto.gj.bankCard.channel;


import cn.freefly.springboot.httpClientUtil.dto.BaseRequest;

import java.util.List;

/**
 * @ClassNmae ChannelPersonBankRequest
 * @Author xiao.yunfei
 * @Date 2020/2/29 14:37
 * @Desc
 */
public class ChannelPersonBankRequest extends BaseRequest {
    private String orderId;
    private List<ChannelPersonBank> fSubjectPerson;

    public ChannelPersonBankRequest() {
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public List<ChannelPersonBank> getfSubjectPerson() {
        return fSubjectPerson;
    }

    public void setfSubjectPerson(List<ChannelPersonBank> fSubjectPerson) {
        this.fSubjectPerson = fSubjectPerson;
    }
}
