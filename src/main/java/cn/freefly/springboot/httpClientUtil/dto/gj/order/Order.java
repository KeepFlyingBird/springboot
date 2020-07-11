package cn.freefly.springboot.httpClientUtil.dto.gj.order;

import lombok.Data;

/**
 * @ClassNmae Order
 * @Description 响应参数
 * @Author houjianhui
 * @Date 2020/2/26 20:07
 * @Version 1.0
 **/
@Data
public class Order {
    private String nodeNo;
    private String instNo;
    private String orderId;
}
