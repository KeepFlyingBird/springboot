package cn.freefly.springboot.httpClientUtil.util.gj;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassNmae GjRequest
 * @Description 国金公共响应参数
 * @Author houjianhui
 * @Date 2020/2/25 15:17
 * @Version 1.0
 **/
@Data
@NoArgsConstructor
public class GjResponse<T> {
    private String errCode;
    private String message;
    private boolean success;
    private T data;
}
