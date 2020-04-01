package cn.freefly.springboot.httpClientUtil.entity.gj;

import java.io.Serializable;
import java.math.BigDecimal;
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
public class CacmpGjAssetRealEstate implements Serializable {
    private String id;

    private String orderId;

    private String ownershipPersonName;

    private String property;

    private String propertyType;

    private String source;

    private String condition;

    private BigDecimal floorSpace;

    private String mortgageAmount;

    private String mortgageYears;

    private String mortgageMonthAmount;

    private String xinxituFic;

    private Date createTime;

    private Date modifyTime;

    private static final long serialVersionUID = 1L;
}