package cn.freefly.springboot.httpClientUtil.dto.gj.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ResFlagE {
    成功(true),
    失败(false);
    private boolean flag;
}
