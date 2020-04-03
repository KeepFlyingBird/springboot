package cn.freefly.springboot.httpClientUtil.dto.gj.enums;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum StageE {
    预审申请("Pretrial",""),
    额度申请("LoanCre","");

    private String code;
    private String stage;
}
