package cn.freefly.springboot.httpClientUtil.util.gj;

import lombok.Data;

/**
 * @ClassNmae GjRequest
 * @Description 国金公共请求参数
 * @Author houjianhui
 * @Date 2020/2/25 15:17
 * @Version 1.0
 **/
@Data
public class GjRequest {
    private String appId;
    private String clientId;
    private String authType;
    private String timestamp;
    private String nonceStr;
    private String sign;
}
