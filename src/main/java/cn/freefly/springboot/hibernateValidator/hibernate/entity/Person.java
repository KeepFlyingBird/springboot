package cn.freefly.springboot.hibernateValidator.hibernate.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.Range;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

/**
 * @ClassNmae Person
 * @Author xiao.yunfei
 * @Date 2020/5/14 18:38
 * @Desc
 */
@Data
public class Person {
    @NotNull(message = "姓名不能为空")
    public String name;
    @Range(min = 1, max = 100, message = "年龄范围不对")
    public int age;
    @NotNull(message = "性别不能为空")
    public String sex;
    @Valid
    public EmergencyContactPerson contactPerson;
}
