package cn.freefly.springboot.httpClientUtil.dto.gj.customer.channel;

import cn.freefly.springboot.devUtils.FieldDesc;
import lombok.Data;

/**
 * @ClassNmae CustomerSubjectPerson
 * @Description 主体自然人信息
 * @Author houjianhui
 * @Date 2020/2/26 13:01
 * @Version 1.0
 **/
@Data
public class ChannelCustomerSubjectPerson {

    @FieldDesc("手机号")
    private String subPhone;

    @FieldDesc("婚姻状况")
    private String marriageState;

    @FieldDesc("身份证正反面照(身份证正面照)")
    private String idCardFrontFic;

    @FieldDesc("身份证正反面照(身份证头像)")
    private String idCardHeadPhoto;

    @FieldDesc("身份证正反面照(身份证反面照)")
    private String idCardReverseFic;

}
