package cn.freefly.springboot.hibernateValidator.hibernate.entity;

import lombok.Data;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.NotNull;

/**
 * @ClassNmae EmergencyContactPerson
 * @Author xiao.yunfei
 * @Date 2020/5/14 18:39
 * @Desc
 */
@Data
public class EmergencyContactPerson {
    @NotNull(message = "紧急联系人姓名不能为空")
    public String name;
    @Range(min = 1, max = 100, message = "紧急联系人年龄范围不对")
    public int age;
}
