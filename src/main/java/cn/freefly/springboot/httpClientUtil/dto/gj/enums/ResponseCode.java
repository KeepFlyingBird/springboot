package cn.freefly.springboot.httpClientUtil.dto.gj.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 返回码枚举类
 * 1xxx 平台校验失败
 * 2xxx 平台数据库错误
 * 3xxx 平台内部服务错误
 * 4xxx 三方接口错误
 *
 * @author yaoheling
 * @date 2019/5/17 14:34
 */
@Getter
@AllArgsConstructor
public enum ResponseCode {

    SUCCESS("0000", "成功"),
    PROCESSING("9999", "处理中"),
    ARGUMENT_CHECK_FAILED("0027", "参数校验不通过"),
    NODE_NO_MATCH("0028","国金流程节点不匹配"),
    FORBIDDEN("0403", "没有访问权限"),
    CHANNEL_NOT_EXISTED("2001","平台渠道配置不存在或者未启动"),
    FUND_NOT_EXISTED("2001","资金方配置不存在或者未启动"),
    ORDER_NOT_EXISTED("2100", "该订单不存在"),
    INTERNAL_SERVER_ERROR("3000", "平台内部服务异常"),
    HTTP_RESPONSE_NULL("4000", "第三方接口响应信息为空"),
    HTTP_EXCEPTION("4001", "第三方HTTP调用异常"),
    RESPONSE_ERROR("4002", "第三方接口返回失败"),
    CHANNEL_ORDER_ATTACH_NOT_EXIST("5003", "当前订单影像资料在平台不存在"),
    CHANNEL_CUSTOMER_REGISTER_ATTACH_NOT_EXIST("5004", "客户登记缺少影像资料"),
    CHANNEL_LOAN_ATTACH_NOT_EXIST("5005", "放款信息录入缺少影像资料"),
    CHANNEL_ORDER_NOT_EXIST("5006", "订单信息在平台不存在"),
    CHANNEL_LOAN_NOT_APPLY("5007", "当前订单不可发起放款申请"),
    CHANNEL_CUSTOMER_REGISTER_NOT_APPLY("5008", "当前订单不可发起客户登记申请"),
    CHANNEL_BANK_CARD_BIND_APPLY("5010", "当前订单不可发起银行卡绑定申请"),
    CHANNEL_VERIFICATION_CODE_BACK_APPLY("5011", "当前订单不可发起验证码回填申请"),
    CHANNEL_FINANACE_INFO_INPUT_ATTACH_NOT_EXIST("5015", "融资信息录入缺少影像资料"),
    CHANNEL_FINANACE_INFO_INPUT_NOT_APPLY("5016", "当前订单不可发起融资信息录入申请"),
    CHANNEL_AMENDS_INFO_INPUT_APPLY("5020", "当前订单不可发起后补信息申请"),
    CHANNEL_ORDER_APPLY_ERROR("6000","当前订单不可发起一汽订单申请"),
    CHANNEL_ORDER_LOAN_ERROR("6001","当前订单不可发起一汽放款申请"),
    CHANNEL_ORDER_MONITOR_ERROR("6002","当前订单不可发起一汽放款后督申请"),
    CHANNEL_PROVINCE_CITY_ERROR("7000","省市县无法匹配"),
    CACMP_PUSH_CHANNEL_ERROR("7001","平台推送渠道端异常");

    private String code;
    private String msg;

}
