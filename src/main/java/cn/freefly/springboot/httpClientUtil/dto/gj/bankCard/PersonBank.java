package cn.freefly.springboot.httpClientUtil.dto.gj.bankCard;

import lombok.Data;

/**
 * @ClassNmae PersonBank
 * @Author xiao.yunfei
 * @Date 2020/2/27 17:50
 * @Desc
 */
@Data
public class PersonBank {
    private String subName;// 收款方银行账号(姓名)
    private String idCardNumber;// 收款方银行账号(身份证号码)
    private String subPhone;// 收款方银行账号(手机号)
    private String bankAccount;// 收款方银行账号(银行卡号)
    private String bankBranchName;// 开户行
    private String isWithholdCard;// 是否需要代扣（01：是；02：否）
}
