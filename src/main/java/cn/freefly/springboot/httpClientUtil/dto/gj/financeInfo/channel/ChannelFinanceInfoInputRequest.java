package cn.freefly.springboot.httpClientUtil.dto.gj.financeInfo.channel;

import cn.freefly.springboot.httpClientUtil.dto.BaseRequest;
import lombok.Data;

/**
 * @ClassNmae ChannelFinanceInfoInputRequest
 * @Author xiao.yunfei
 * @Date 2020/2/28 20:59
 * @Desc
 */
@Data
public class ChannelFinanceInfoInputRequest extends BaseRequest {
    private String orderId;
    private ChannelFinanceInfoAssetCar assetCar;
    private ChannelFinanceInfoAssetCarAssessment assetCarAssessment;
    private ChannelFinanceInfoAssetCarExtend assetCarExtend;
    private ChannelFinanceInfoAssetRealEstates assetRealEstates;
    private ChannelFinanceInfoBusinessInfo busi;
    private ChannelFinanceInfoBusinessInfoExtend busiExtend;
    private ChannelFinanceInfoBusinessFinance busiFinance;
    private ChannelFinanceInfoSubjectContacts subjectContacts;
    private ChannelFinanceInfoSubjectGuarantees subjectGuarantees;
    private ChannelFinanceInfoSubjectPerson subjectPerson;
    private ChannelFinanceInfoSubjectSpouse subjectSpouse;
}
