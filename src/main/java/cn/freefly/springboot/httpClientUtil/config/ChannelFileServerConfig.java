package cn.freefly.springboot.httpClientUtil.config;

import lombok.Data;

/**
 * @ClassNmae ChannelFileServerConfig
 * @Description 渠道文件服务器配置类
 * @Author zl
 * @Date 2019/7/2 11:00
 * @Version 1.0
 **/
@Data
public class ChannelFileServerConfig {
    // 文件服务器地址
    private String host;
    // 服务器端口
    private String port;
    // 服务器用户名
    private String userName;
    // 服务器密码
    private String password;
    //渠道临时文件目录
    private String remoteDir;
    //平台临时文件目录
    private String localDir;
}
