package cn.freefly.springboot.httpClientUtil.dto.gj.financeInfo;

import lombok.Data;

/**
 * @ClassNmae FinanceInfoAssetCarExtend
 * @Author xiao.yunfei
 * @Date 2020/2/28 22:46
 * @Desc
 */
@Data
public class FinanceInfoAssetCarExtend {
    private String variableSpeed;
    private String carDisplacement;
    private String passengerNum;
    private String xingshizhengFic;//行驶证照(行驶证主页)
    private String xingshizhengBackFic;//行驶证照(行驶证副页)
    private String dengjizFic;//登记证
    private String dengjizFic2;//登记证
    private String jiaoqiangxianzhaoFic;//保单照
    private String shangyebaodanFic;//保单照

}
