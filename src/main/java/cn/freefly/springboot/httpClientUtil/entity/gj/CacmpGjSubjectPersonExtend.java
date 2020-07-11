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
public class CacmpGjSubjectPersonExtend implements Serializable {
    private String id;

    private String personId;

    private String certEffectiveDate;

    private String certExpiryDate;

    private String certIssuer;

    private String education;

    private String healthStatus;

    private String registerProvince;

    private String registerProvinceName;

    private String registerCity;

    private String registerCityName;

    private String registerDistrict;

    private String registerDistrictName;

    private String registerAddress;

    private String registerLng;

    private String registerLat;

    private String currentProvince;

    private String currentProvinceName;

    private String currentCity;

    private String currentCityName;

    private String currentDistrict;

    private String currentDistrictName;

    private String currentAddress;

    private String currentLng;

    private String currentLat;

    private String familyPopulationNum;

    private String companyProvince;

    private String companyProvinceName;

    private String companyCity;

    private String companyCityName;

    private String companyDistrict;

    private String companyDistrictName;

    private String companyAddress;

    private String companyLng;

    private String companyLat;

    private String workNature;

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