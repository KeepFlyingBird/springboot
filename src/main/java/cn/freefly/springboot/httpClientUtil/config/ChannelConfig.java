package cn.freefly.springboot.httpClientUtil.config;

import lombok.Data;

/**
 * @ClassNmae ChannelConfig
 * @Description 渠道配置文件
 * @Author houjianhui
 * @Date 2019/7/10 11:44
 * @Version 1.0
 **/
@Data
public class ChannelConfig {
    // 渠道回调配置类
    private ChannelCallBackConfig callBackConfig;
    // 渠道文件服务器配置类
    private ChannelFileServerConfig fileServerConfig;
    //资金方
    private String fundCode;
}
