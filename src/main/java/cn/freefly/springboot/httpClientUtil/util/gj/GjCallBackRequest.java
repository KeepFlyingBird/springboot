package cn.freefly.springboot.httpClientUtil.util.gj;

import lombok.Data;

/**
 * @ClassNmae GjCallBackRequest
 * @Author xiao.yunfei
 * @Date 2020/2/28 15:55
 * @Desc
 */
@Data
public class GjCallBackRequest {
    private String instNo;
    private String nodeNo;
    private String nodeStatus;
    private String remark;
}
