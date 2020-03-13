package cn.freefly.springboot.httpClientUtil.dto;

import lombok.Builder;
import lombok.Data;

/**
 * @ClassNmae RequestParams
 * @Author xiao.yunfei
 * @Date 2020/3/12 20:37
 * @Desc
 */
@Data
@Builder
public class RequestParams {
    /**
     * 请求流水
     */
    private String requestSeqNo;

    /**
     * 接口编号
     */
    private String interfaceId;

    /**
     * 银行国际码
     */
    private String bankCode;

    /**
     * 合作商代码
     */
    private String corporateCode;
    /**
     * 产品代码
     */
    private String productType;

    /**
     * 报文内容
     */
    private Object infoContent;
    /**
     * 报文签名
     */
    private String infoSign;

}
