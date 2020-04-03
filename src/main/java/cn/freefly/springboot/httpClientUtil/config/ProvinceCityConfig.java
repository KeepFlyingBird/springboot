package cn.freefly.springboot.httpClientUtil.config;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @Author zjj
 * @Description 类注释
 * @Date 2019/10/24
 * @ClassName ProvinceCityConfig
 **/
@Data
@TableName("cacmp_province_city_config")
public class ProvinceCityConfig {
    //id
    @TableId(value = "id", type = IdType.AUTO)
    private String id;
    //平台省
    @TableField(value = "province")
    private String province;
    //平台市
    @TableField(value = "city")
    private String city;
    //平台县
    @TableField(value = "country")
    private String country;
    //平台省编码
    @TableField(value = "province_code")
    private String provinceCode;
    //平台县编码
    @TableField(value = "country_code")
    private String countryCode;
    //平台市编码
    @TableField(value = "city_code")
    private String cityCode;
    //一汽省编码
    @TableField(value = "yq_province_code")
    private String yqProvinceCode;
    //一汽县编码
    @TableField(value = "yq_country_code")
    private String yqCountryCode;
    //创建时间
    @TableField(value = "create_time")
    private String createTime;
    //修改时间
    @TableField(value = "modify_time")
    private String modifyTime;

    @TableField(value = "gj_province_code")
    private String gjProvinceCode;

    @TableField(value = "gj_city_code")
    private String gjCityCode;

    @TableField(value = "gj_county_code")
    private String gjCountyCode;


}
