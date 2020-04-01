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
public class CacmpGjBusinessMortgage implements Serializable {
    private String id;

    private String orderId;

    private String diyahetongFic;

    private String diyadengjiFic;

    private String diyadengjiFic2;

    private String huizhizhaoFic;

    private String mortgageRightType;

    private String mortgageRightPerson;

    private Date mortgageDate;

    private String realmortgageRightType;

    private String realmortgageRightPeople;

    private Date createTime;

    private Date modifyTime;

    private static final long serialVersionUID = 1L;
}