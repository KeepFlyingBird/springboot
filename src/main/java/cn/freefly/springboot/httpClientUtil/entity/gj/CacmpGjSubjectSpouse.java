package cn.freefly.springboot.httpClientUtil.entity.gj;

import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
* Created by Mybatis Generator on 2020/03/31
*/
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CacmpGjSubjectSpouse implements Serializable {
    private String id;

    private String orderId;

    private String persionId;

    private String isJointTenants;

    private String idCardFrontFic;

    private String idCardHeadPhoto;

    private String idCardReverseFic;

    private String jiashibenFic;

    private String jiashibenBackFic;

    private String spousePhone;

    private String spouseBankAccount;

    private String spousePhoneCode;

    private String rbzxsqFic;

    private String rbzxcxFic;

    private String zhengmianFic;

    private String gongtonghuankuanchengnuoshuFic;

    private String gongtonghuankuanchengnuoshuqianziFic;

    private String shouchigongtonghuankuanchengnuoshuFic;

    private String shouruzhengmFic;

    private String yhliushuituFic;

    private String hunyinxinxiFic;

    private String marriageState;

    private String contactEmail;

    private String company;

    private String subName;

    private String idCardNumber;

    private String subPhone;

    private String bankAccount;

    private String phoneCode;

    private String bankCardPhoto;

    private String hukouboJuzhuzhengmingFic;

    private String tfbankxinyongkaFic;

    private String chaorongqingdanFic;

    private String otherdocumentFic;

    private String qianyuegaozhihanFic;

    private String wangyuechezhengFic;

    private String guakaozhengmingFic;

    private String spouseName;

    private String spouseIdcard;

    private Date createTime;

    private Date modifyTime;

    private static final long serialVersionUID = 1L;
}