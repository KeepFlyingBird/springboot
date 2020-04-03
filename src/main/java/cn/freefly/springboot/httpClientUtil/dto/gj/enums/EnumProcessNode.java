package cn.freefly.springboot.httpClientUtil.dto.gj.enums;

public enum EnumProcessNode {
    CUSTOMER_REGISTRATION("ESCHZ-001","客户登记"),
    INDUSTRY_FUND_PRETRIAL("ESCHZ-002","产业基金预审"),
    FUND_PRETRIAL("ESCHZ-003","资金方预审"),
    FINANACE_INFO_INPUT("ESCHZ-004","融资信息录入"),
    INDUSTRY_FUND_FINAL_JUDGE("ESCHZ-005","产业基金终审"),
    FUND_FINAL_JUDGE("ESCHZ-006","资金方终审"),
    FACE_SIGN("ESCHZ-007","面签"),
    FUND_CONTRACT_SIGN("ESCHZ-008","资金方合同签约"),
    LOAN_INFO_INPUT("ESCHZ-009","放款信息录入"),
    INDUSTRY_FUND_LOAN_JUDGE("ESCHZ-010","产业基金放款审核"),
    INDUSTRY_FUND_MONEY("ESCHZ-011","产业基金垫资"),
    FUND_LOAN("ESCHZ-012","资金方放款"),
    AMENDS_INFO_INPUT("ESCHZ-013","后补信息录入"),
    INDUSTRY_FUND_DATA_FILE("ESCHZ-014","产业基金资料归档"),
    FUND_DATA_FILE("ESCHZ-015","资金方资料归档");

    private String code;
    private String desc;
    EnumProcessNode(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }
    public String getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }
}
