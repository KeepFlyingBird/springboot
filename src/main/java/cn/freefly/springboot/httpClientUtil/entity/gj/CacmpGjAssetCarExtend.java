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
public class CacmpGjAssetCarExtend implements Serializable {
    private String id;

    private String orderId;

    private String oldCarPlate;

    private String variableSpeed;

    private String carDisplacement;

    private String passengerNum;

    private String weightNum;

    private Date yearlyInspectionDate;

    private String xingshizhengFic;

    private String xingshizhengBackFic;

    private String dengjizFic;

    private String dengjizFic2;

    private String jiaoqiangxianzhaoFic;

    private String shangyebaodanFic;

    private String buyCarContractCode;

    private Date relieveMortgageDate;

    private Date createTime;

    private Date modifyTime;

    private static final long serialVersionUID = 1L;
}