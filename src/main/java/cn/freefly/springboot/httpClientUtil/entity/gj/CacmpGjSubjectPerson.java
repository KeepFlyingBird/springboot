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
public class CacmpGjSubjectPerson implements Serializable {
    private String id;

    private String orderId;

    private String subPhone;

    private String marriageState;

    private String idCardFrontFic;

    private String idCardHeadPhoto;

    private String idCardReverseFic;

    private String shouruzhengmFic;

    private String contactEmail;

    private String company;

    private String subName;

    private String idCardNumber;

    private String bankAccount;

    private String phoneCode;

    private String bankCardPhoto;

    private String jiashibenFic;

    private String jiashibenBackFic;

    private String zhengmianFic;

    private String yhliushuituFic;

    private String hunyinxinxiFic;

    private String hukoubojuzhuzhengmingFic;

    private String tfbankxinyongkaFic;

    private String chaorongqingdanFic;

    private String otherdocumentFic;

    private String qianyuegaozhihanFic;

    private String wangyuechezhengFic;

    private String guakaozhengmingFic;

    private Date createTime;

    private Date modifyTime;

    private static final long serialVersionUID = 1L;
}