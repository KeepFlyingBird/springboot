package cn.freefly.springboot.httpClientUtil.dto.gj.enums;

public enum UploadFieldEnum {
    PRETRIAL("01","客户登记"),
    FINALJUDGMENT("02","融资信息录入"),
    LOANAPPLICATION("03","放款信息录入"),
    MAKEAMENDS("04","候补信息录入")

    ;


    String code;//阶段编号编号
    String name;//阶段名称

    //构造方法
    UploadFieldEnum(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public static String getName(Integer code){
        for(UploadFieldEnum evenEnum : UploadFieldEnum.values()){
            if(evenEnum.getCode().equals(code)){
                return evenEnum.getName();
            }
        }
        return null;
    }
    //成员方法
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
