package cn.freefly.springboot.httpClientUtil.config.gj;

import cn.freefly.springboot.httpClientUtil.config.ChannelCallBackConfig;
import cn.freefly.springboot.httpClientUtil.config.ChannelFileServerConfig;
import lombok.Data;

/**
 * @ClassNmae ChannelConfig
 * @Description 渠道配置文件
 * @Author houjianhui
 * @Date 2019/7/10 11:44
 * @Version 1.0
 **/
@Data
public class GjChannelConfig {
    // 渠道回调配置类
    private ChannelCallBackConfig callBackConfig;
    // 渠道文件服务器配置类
    private ChannelFileServerConfig fileServerConfig;
    // 国金资金模式配置
    private ChannelGjFundModeConfig fundModeConfig;
    //资金方
    private String fundCode;
}
