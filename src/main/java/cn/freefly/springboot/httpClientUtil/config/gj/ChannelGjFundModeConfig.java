package cn.freefly.springboot.httpClientUtil.config.gj;

import lombok.Data;

/**
 * @ClassNmae ChannelGjFundModeConfig
 * @Description 人保资金模式
 * @Author houjianhui
 * @Date 2019/7/2 11:11
 * @Version 1.0
 **/
@Data
public class ChannelGjFundModeConfig {
    // 产品编码
    private String productCode;
    // 档位编码
    private String productSeriesCode;
    // 资方分配的APPID
    private String appId;
    // 资方分配的ClientID
    private String clientId;
    // 资方分配的CompanyID
    private String companyId;
}
