package cn.freefly.springboot.httpClientUtil.dto.gj.order;

import lombok.Data;

/**
 * @ClassNmae OrderRequest
 * @Author xiao.yunfei
 * @Date 2020/3/31 13:38
 * @Desc
 */
@Data
public class OrderRequest {
    private String productCode;
    private String productSeriesCode;
}
