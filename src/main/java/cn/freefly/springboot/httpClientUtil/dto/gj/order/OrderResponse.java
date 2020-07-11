package cn.freefly.springboot.httpClientUtil.dto.gj.order;

import lombok.Data;

/**
 * @ClassNmae OrderRes
 * @Description 响应对象
 * @Author houjianhui
 * @Date 2020/2/26 19:46
 * @Version 1.0
 **/
@Data
public class OrderResponse<T> {
    private T flow;
}
