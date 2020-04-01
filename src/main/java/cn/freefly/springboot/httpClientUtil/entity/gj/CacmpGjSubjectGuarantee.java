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
public class CacmpGjSubjectGuarantee implements Serializable {
    private String id;

    private String orderId;

    private String businessId;

    private String persionId;

    private String codeSign;

    private String idCardFrontFic;

    private String idCardHeadPhoto;

    private String idCardReverseFic;

    private String rbzxsqshuFic;

    private String rbzxsqFic;

    private String zhengmianFic;

    private String gongtonghuankuanchengnuoshuFic;

    private String gongtonghuankuanchengnuoshuqianziFic;

    private String shouchigongtonghuankuanchengnuoshuFic;

    private String hunyinFic;

    private String shouruzhengmFic;

    private String yinhangliushuiFic;

    private String guaranteePhone;

    private String education;

    private String marriageState;

    private String guaranteeRelation;

    private String company;

    private String companyNature;

    private String jobNature;

    private String companyTel;

    private String workDepartment;

    private String workPosition;

    private String profession;

    private String workingAge;

    private String monthIncome;

    private String repaymentSource;

    private Date createTime;

    private Date modifyTime;

    private static final long serialVersionUID = 1L;
}