package cn.freefly.springboot.httpClientUtil.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import javax.validation.Valid;

/**
 * @ClassNmae BaseRequest
 * @Author xiao.yunfei
 * @Date 2020/3/5 21:33
 * @Desc
 */
@Getter
@Setter
public class BaseRequest {
    @ApiModelProperty(required = true)
    @Valid
    private Header header;
}
