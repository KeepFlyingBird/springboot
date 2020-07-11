package cn.freefly.springboot.httpClientUtil.config;

import lombok.Data;

/**
 * @Author: qiaoxiaoqiang
 * @Date: 2019/7/10
 * @Version 1.0
 */
@Data
public class FundSftpConfig {
    private String sftpIp;
    private String port;
    private String userName;
    private String password;
    private String path;
}
