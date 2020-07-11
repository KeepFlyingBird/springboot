package cn.freefly.springboot.httpClientUtil.dto.gj.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @Author houjianhui
 * @Description 国金订单状态
 * @Date 14:54 2020/3/25
 * @Param
 * @return
 **/
@Getter
@AllArgsConstructor
public enum GjOrderStatusE {

    初始化订单成功("1000", "初始化订单成功"),
    客户登记受理成功("1010", "客户登记受理成功"),
    客户登记受理失败("1015", "客户登记受理失败"),
    客户登记回调成功("1020", "客户登记回调成功"),
    客户登记回调失败("1025", "客户登记回调失败"),
    客户登记驳回("1026", "客户登记驳回"),
    银行卡绑卡成功("1030", "银行卡绑卡成功"),
    银行卡绑卡失败("1035", "银行卡绑卡失败"),
    银行卡绑卡验证码回填成功("1040", "银行卡绑卡验证码回填成功"),
    银行卡绑卡验证码回填失败("1045", "银行卡绑卡验证码回填失败"),
    车辆查询成功("1050", "车辆查询成功"),
    车辆查询失败("1055", "车辆查询失败"),
    融资信息录入受理成功("1060", "融资信息录入受理成功"),
    融资信息录入受理失败("1065", "融资信息录入受理失败"),
    融资信息录入回调成功("1070", "融资信息录入回调成功"),
    融资信息录入回调失败("1075", "融资信息录入回调失败"),
    融资信息录入驳回("1076", "融资信息录入驳回"),
    GPS绑定成功("1080", "GPS绑定成功"),
    GPS绑定失败("1085", "GPS绑定失败"),
    放款申请受理成功("1090", "放款申请受理成功"),
    放款申请受理失败("1095", "放款申请受理失败"),
    放款申请回调成功("1100", "放款申请回调成功"),
    放款申请回调失败("1105", "放款申请回调失败"),
    放款申请驳回("1106", "放款申请驳回"),
    后补信息录入成功("1110", "后补信息录入成功"),
    后补信息录入失败("1115", "后补信息录入失败"),
    后补信息录入回调成功("1120", "后补信息录入回调成功"),
    后补信息录入回调失败("1125", "后补信息录入回调失败"),
    废弃("1130", "废弃");


    private String code;
    private String message;
}
