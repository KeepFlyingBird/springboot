package cn.freefly.springboot.httpClientUtil.dto.gj.financeInfo;

import lombok.Data;

/**
 * @ClassNmae FinanceInfoAssetCar
 * @Author xiao.yunfei
 * @Date 2020/2/28 22:38
 * @Desc
 */
@Data
public class FinanceInfoAssetCar {
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
    private String cheqianzhaoFic;//车前照
    private String pinggushiFic;//车+评估师
    private String abzhuFic;//左前门含AB柱
    private String yibaioFic;//仪表盘照
    private String yaoshiFic;//车钥匙照
    private String zhongkongFic;//中控台
    private String zuohoumenFic;//左后门含C柱
    private String beitaiFic;//备胎槽
    private String chehouzhaoFic;//车后照
    private String youhouFic;//右后45°
    private String youqianFic;//左前45°
    private String vinFic;//vin码
    private String chuchangFic;//出厂牌
    private String yinqingFic;//引擎舱

}
