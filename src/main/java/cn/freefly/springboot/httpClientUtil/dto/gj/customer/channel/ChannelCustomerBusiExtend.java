package cn.freefly.springboot.httpClientUtil.dto.gj.customer.channel;

import cn.freefly.springboot.devUtils.FieldDesc;
import lombok.Data;

/**
 * @ClassNmae CustomerBusiExtend
 * @Description 业务信息扩展信息
 * @Author houjianhui
 * @Date 2020/2/26 13:01
 * @Version 1.0
 **/
@Data
public class ChannelCustomerBusiExtend {

    @FieldDesc("业务发生地(省级地址)")
    private String busiProvince;

    @FieldDesc("业务发生地(省级地址编码)")
    private String busiProvinceName;

    @FieldDesc("业务发生地(市级地址)")
    private String busiCity;

    @FieldDesc("业务发生地(市级地址编码)")
    private String busiCityName;

    @FieldDesc("业务发生地(区级地址)")
    private String busiDistrict;

    @FieldDesc("业务发生地(区级地址编码)")
    private String busiDistrictName;

    @FieldDesc("业务发生地(详细地址)")
    private String busiAddress;

    @FieldDesc("业务发生地(经度)")
    private String busiLng;

    @FieldDesc("业务发生地(纬度)")
    private String busiLat;

}
