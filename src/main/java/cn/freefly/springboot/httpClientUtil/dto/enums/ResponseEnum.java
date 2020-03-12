package cn.freefly.springboot.httpClientUtil.dto.enums;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@AllArgsConstructor
public enum ResponseEnum {
    Success("0000","成功"),
    Argument_Check_Failed("0001","参数校验不通过");

    private String code;
    private String msg;
}
