package cn.freefly.springboot.httpClientUtil.dto.gj.customer.channel;

import cn.freefly.springboot.httpClientUtil.dto.BaseRequest;
import lombok.Data;

/**
 * @ClassNmae ChannelCustomerRequest
 * @Description 客户登记请求参数
 * @Author houjianhui
 * @Date 2020/2/28 17:25
 * @Version 1.0
 **/
@Data
public class ChannelCustomerRequest extends BaseRequest {
    private String orderId;
    private ChannelCustomerAssetCarExtend assetCarExtend;
    private ChannelCustomerBusiExtend businessExtend;
    private ChannelCustomerSubjectPerson subjectPerson;
}
