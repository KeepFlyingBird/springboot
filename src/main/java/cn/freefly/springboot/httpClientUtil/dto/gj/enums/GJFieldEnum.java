package cn.freefly.springboot.httpClientUtil.dto.gj.enums;



public enum GJFieldEnum {
    身份证正面照("SFZ_ZMZ",01),
    身份证反面照("SFZ_FMZ",01),
    其他证明资料("QTZMZL",01),
    车前照("CAR_CQZ",02),
    车评估师("CAR_PGS",02),
    左前门含AB柱("CAR_ZQM",02),
    仪表盘照("CAR_YBPZ",02),
    车钥匙照("CAR_CYSZ",02),
    中控台("CAR_ZKT",02),
    左后门含C柱("CAR_ZHM",02),
    备胎槽("CAR_BTC",02),
    车后照("CAR_CHZ",02),
    右后45度("CAR_YHZ",02),
    左前45度("CAR_ZQ",02),
    vin码("CAR_VIN",02),
    出厂牌("CAR_CCP",02),
    引擎舱("CAR_YQC",02),
    事故修复及其他图片("CAR_SGXF",02),
    行驶证照行驶证主页("ASSETS_XSZZY",02),
    行驶证照行驶证副页("ASSETS_XSZFY",02),
    登记证首页("ASSETS_DJZSY",02),
    登记证其他页("ASSETS_DJZQTY",02),
    商业险保单照("ASSETS_BDZSY",02),
    交强险保单照("ASSETS_BDZQTY",02),
    房产证信息图("ASSETS_FXZT",02),
    签订合同("BUSINESS_QDHT",02),
    其他文件资料("BUSINESS_QTWJZL",02),
    签订合同1("SUBJECT_DBR_QDHT",02),
    担保人身份证正面照("SUBJECT_DBR_SFE_ZMZ",02),
    担保人身份证反面照("SUBJECT_DBR_SFE_FMZ",02),
    收入证明图("SUBJECT_SRZM",02),
    婚姻信息图("SUBJECT_HYXXT",02),
    户口簿("SUBJECT_HKB",02),
    配偶身份证正面照("SUBJECT_PO_SFZ_ZMZ",02),
    配偶身份证反面照("SUBJECT_PO_SFZ_FMZ",02),
    购车合同("ASSETS_CAR_GCHT",03),
    GPS设备("ASSETS_CAR_GPS",03),
    GPS线下安装照("ASSETS_CAR_GPSAZ",03),
    融资租赁合同("BUSINESS_RZZPHT",03),
    抵押合同("MORTGAGE_DYHT",03),
    抵押后车辆登记证首页("MORTGAGE_CLDJZSY",03),
    抵押后车辆登记证其他页("MORTGAGE_CLDJZQTY",03),
    抵押合同2("MORTGAGE_DYHT2",03),
    收款方银行卡账号("MORTGAGE_SKFYHKZH",02)
    ;

    String category;//影像类别
    Integer code;//阶段

    //构造方法
    GJFieldEnum(String category, Integer code) {
        this.category = category;

        this.code = code;
    }


    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }


    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
