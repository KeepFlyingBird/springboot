package cn.freefly.springboot.httpClientUtil.dto.gj.enums;

public enum FielStatedEnum {
    客户登记("PRETRIAL"),
    融资信息录入("FINALJUDGMENT"),
    放款信息录入("LOANAPPLICATION"),
    候补信息录入("MAKEAMENDS")
    ;

    String code;//阶段编号编号
    //构造方法
    FielStatedEnum(String code) {
        this.code = code;
    }

   //成员方法
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }



}
