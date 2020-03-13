package cn.freefly.springboot.httpClientUtil.dto.pretrial;

import cn.freefly.springboot.devUtils.FieldDesc;
import lombok.Data;

/**
 * @ClassNmae PretrialApplyRequest
 * @Author xiao.yunfei
 * @Date 2020/3/5 23:00
 * @Desc
 */
@Data
public class PretrialApplyRequest {
    @FieldDesc("项目编号 | Y")
    private String projectNo;

    @FieldDesc("授信申请单号 | Y")
    private String applNo;

    @FieldDesc("渠道申请单号 | Y")
    private String loanlNo;

    @FieldDesc("合作渠道 | Y")
    private String qudLay;

    @FieldDesc("姓名 | Y")
    private String custName;

    @FieldDesc("证件类型 | Y")
    private String idType;

    @FieldDesc("证件号 | Y")
    private String idNo;

    @FieldDesc("手机号码 | Y")
    private String phoneNo;

    @FieldDesc("合作商业务类型 | Y")
    private String cooprBussType;
}
