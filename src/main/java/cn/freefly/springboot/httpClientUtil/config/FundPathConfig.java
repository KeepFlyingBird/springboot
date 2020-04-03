package cn.freefly.springboot.httpClientUtil.config;

import lombok.Data;

/**
 * 资金方相关的配置
 * @Author: qiaoxiaoqiang
 * @Date: 2019/7/10
 * @Version 1.0
 */
@Data
public class FundPathConfig {
    private FundServerConfig serverConfig;
    private FundSftpConfig sftpConfig;
}
