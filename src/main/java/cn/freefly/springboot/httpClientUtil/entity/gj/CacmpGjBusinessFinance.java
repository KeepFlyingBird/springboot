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
public class CacmpGjBusinessFinance implements Serializable {
    private String id;

    private String orderId;

    private String businessId;

    private String maxApprovePercentage;

    private String approvePercentage;

    private BigDecimal maxApprovesum;

    private BigDecimal approveSum;

    private BigDecimal contractSum;

    private BigDecimal bankInterestRate;

    private BigDecimal disposableFee;

    private BigDecimal eachissueFee;

    private Date createTime;

    private Date modifyTime;

    private static final long serialVersionUID = 1L;
}