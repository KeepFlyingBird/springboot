package cn.freefly.springboot.mybatisPlus.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 资产汽车表
 * </p>
 *
 * @author admin
 * @since 2020-06-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("cacmp_gj_asset_car")
@ApiModel(value="GjAssetCar对象", description="资产汽车表")
public class GjAssetCar extends Model<GjAssetCar> {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键")
    private String id;

    @ApiModelProperty(value = "订单ID")
    private String orderId;

    @ApiModelProperty(value = "车辆构成")
    private String carType;

    @ApiModelProperty(value = "车辆使用性质")
    private String carNature;

    @ApiModelProperty(value = "车辆所属性质")
    private String belongType;

    @ApiModelProperty(value = "车辆类型")
    private String carProductionType;

    @ApiModelProperty(value = "车辆分类")
    private String carClassify;

    @ApiModelProperty(value = "使用性质")
    private String vehicleUsage;

    @ApiModelProperty(value = "车辆品牌")
    private String brand;

    @ApiModelProperty(value = "车辆系列")
    private String carSeries;

    @ApiModelProperty(value = "车辆颜色")
    private String carColor;

    @ApiModelProperty(value = "燃油类型")
    private String fuelType;

    @ApiModelProperty(value = "上牌省市区(省级地址)")
    private String registerProvince;

    @ApiModelProperty(value = "上牌省市区(省级地址编码)")
    private String registerProvinceName;

    @ApiModelProperty(value = "上牌省市区(市级地址)")
    private String registerCity;

    @ApiModelProperty(value = "上牌省市区(市级地址编码)")
    private String registerCityName;

    @ApiModelProperty(value = "上牌省市区(区级地址)")
    private String registerDistrict;

    @ApiModelProperty(value = "上牌省市区(区级地址编码)")
    private String registerDistrictName;

    @ApiModelProperty(value = "上牌省市区(详细地址)")
    private String registerAddress;

    @ApiModelProperty(value = "上牌省市区(经度)")
    private String registerLng;

    @ApiModelProperty(value = "上牌省市区(纬度)")
    private String registerLat;

    @ApiModelProperty(value = "车系代码")
    private String carModel;

    @ApiModelProperty(value = "车架号")
    private String vinCode;

    @ApiModelProperty(value = "发动机号")
    private String engineNo;

    @ApiModelProperty(value = "初始登记日期")
    private String registrationDate;

    @ApiModelProperty(value = "出厂日期")
    private String productionDate;

    @ApiModelProperty(value = "里程")
    private Integer mileage;

    @ApiModelProperty(value = "车前照")
    private String cheqianzhaoFic;

    @ApiModelProperty(value = "车+评估师")
    private String pinggushiFic;

    @ApiModelProperty(value = "左前门含AB柱")
    private String abzhuFic;

    @ApiModelProperty(value = "仪表盘照")
    private String yibaioFic;

    @ApiModelProperty(value = "车钥匙照")
    private String yaoshiFic;

    @ApiModelProperty(value = "中控台")
    private String zhongkongFic;

    @ApiModelProperty(value = "左后门含C柱")
    private String zuohoumenFic;

    @ApiModelProperty(value = "备胎槽")
    private String beitaiFic;

    @ApiModelProperty(value = "车后照")
    private String chehouzhaoFic;

    @ApiModelProperty(value = "右后45°")
    private String youhouFic;

    @ApiModelProperty(value = "左前45°")
    private String youqianFic;

    @ApiModelProperty(value = "vin码")
    private String vinFic;

    @ApiModelProperty(value = "出厂牌")
    private String chuchangFic;

    @ApiModelProperty(value = "引擎舱")
    private String yinqingFic;

    @ApiModelProperty(value = "事故修复及其他图片")
    private String weixiuFic;

    @ApiModelProperty(value = "购车合同（车辆买卖合同）")
    private String gouchehetongFic;

    @ApiModelProperty(value = "GPS线下安装照")
    private String addGpsFic;

    @ApiModelProperty(value = "GPS设备照")
    @TableField("gpsFic")
    private String gpsFic;

    private LocalDateTime createTime;

    @ApiModelProperty(value = "更新时间")
    private LocalDateTime modifyTime;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
