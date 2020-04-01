package cn.freefly.springboot.httpClientUtil.dto.gj.financeInfo.channel;

import lombok.Data;

/**
 * @ClassNmae ChannelFinanceInfoAssetCar
 * @Author xiao.yunfei
 * @Date 2020/2/28 23:05
 * @Desc
 */
@Data
public class ChannelFinanceInfoAssetCar {
    private String carProductionType;
    private String carClassify;
    private String vehicleUsage;
    private String brand;
    private String carSeries;
    private String carColor;
    private String fuelType;
    private String carModel;
    private String vinCode;
    private String engineNo;
    private String registrationDate;
    private String productionDate;
    private int mileage;
}
