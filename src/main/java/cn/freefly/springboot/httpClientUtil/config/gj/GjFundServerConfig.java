package cn.freefly.springboot.httpClientUtil.config.gj;

import lombok.Data;

@Data
public class GjFundServerConfig {
    // 国金Http地址
    private String host;

    // 国金秘钥
    private String secret;

    // 进件API地址
    private String createOrderUrl;

    // 保存API地址
    private String saveApiUrl;

    // 银行卡绑定API地址
    private String bindBankCardUrl;

    // GPS绑定地址
    private String bindGpsUrl;

    // GPS绑定短信验证码回传地址
    private String msgBackFillUrl;

    // 查询车辆系列地址
    private String carSeriesUrl;

    // 业务处理地址
    private String operateUrl;

}
