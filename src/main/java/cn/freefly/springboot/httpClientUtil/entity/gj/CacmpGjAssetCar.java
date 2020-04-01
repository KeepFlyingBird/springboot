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
public class CacmpGjAssetCar implements Serializable {
    private String id;

    private String orderId;

    private String carType;

    private String carNature;

    private String belongType;

    private String carProductionType;

    private String carClassify;

    private String vehicleUsage;

    private String brand;

    private String carSeries;

    private String carColor;

    private String fuelType;

    private String registerProvince;

    private String registerProvinceName;

    private String registerCity;

    private String registerCityName;

    private String registerDistrict;

    private String registerDistrictName;

    private String registerAddress;

    private String registerLng;

    private String registerLat;

    private String carModel;

    private String vinCode;

    private String engineNo;

    private Date registrationDate;

    private Date productionDate;

    private Integer mileage;

    private String cheqianzhaoFic;

    private String pinggushiFic;

    private String abzhuFic;

    private String yibaioFic;

    private String yaoshiFic;

    private String zhongkongFic;

    private String zuohoumenFic;

    private String beitaiFic;

    private String chehouzhaoFic;

    private String youhouFic;

    private String youqianFic;

    private String vinFic;

    private String chuchangFic;

    private String yinqingFic;

    private String weixiuFic;

    private String gouchehetongFic;

    private String addGpsFic;

    private String gpsfic;

    private Date createTime;

    private Date modifyTime;

    private static final long serialVersionUID = 1L;
}