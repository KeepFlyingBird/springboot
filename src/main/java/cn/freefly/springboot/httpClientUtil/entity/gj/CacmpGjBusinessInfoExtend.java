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
public class CacmpGjBusinessInfoExtend implements Serializable {
    private String id;

    private String orderId;

    private String busiProvince;

    private String busiProvinceName;

    private String busiCity;

    private String busiCityName;

    private String busiDistrict;

    private String busiDistrictName;

    private String busiAddress;

    private String busiLng;

    private String busiLat;

    private String busiContractDate;

    private String rongzihetongFic;

    private String toubaodanFic;

    private String codeSign;

    private String busiCode;

    private String busiType;

    private String bankId;

    private String sellerCompanyId;

    private String sellerDeptId;

    private String sellerLeaderId;

    private String sellerId;

    private String nuclearRecording;

    private String otherFiles;

    private Date createTime;

    private Date modifyTime;

    private static final long serialVersionUID = 1L;
}