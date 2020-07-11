package cn.freefly.springboot.httpClientUtil.config;

import lombok.Data;

/**
 * @ClassNmae ChannelCallBackConfig
 * @Description 渠道回调配置类
 * @Author zl
 * @Date 2019/7/2 11:14
 * @Version 1.0
 **/
@Data
public class ChannelCallBackConfig {
    // 回调渠道地址
    private String host;
    //回调渠道路径
    private String callBack;
}
