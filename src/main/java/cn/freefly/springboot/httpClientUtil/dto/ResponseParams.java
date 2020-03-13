package cn.freefly.springboot.httpClientUtil.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassNmae ResponseParams
 * @Author xiao.yunfei
 * @Date 2020/3/12 22:00
 * @Desc
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseParams {
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
     * 返回代码
     */
    private String respCode;
    /**
     * 返回信息
     */
    private String respMsg;
    /**
     * 报文内容
     */
    private Object infoContent;
    /**
     * 报文签名
     */
    private String infoSign;
}
