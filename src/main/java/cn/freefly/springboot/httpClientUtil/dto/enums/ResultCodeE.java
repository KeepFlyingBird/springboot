package cn.freefly.springboot.httpClientUtil.dto.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum ResultCodeE {
    交易成功("S", "交易成功"),
    接口序列号重复("R", "接口序列号重复"),
    报文解密异常("C", "报文解密异常"),
    签名校验未通过("U", "签名校验未通过"),
    交易失败("E", "交易失败");

    public String retCode;
    public String retMsg;
}
