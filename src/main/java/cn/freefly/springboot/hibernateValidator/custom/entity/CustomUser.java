package cn.freefly.springboot.hibernateValidator.custom.entity;

import cn.freefly.springboot.hibernateValidator.custom.interfaces.CustomInf;
import lombok.Data;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @ClassNmae EnumUser
 * @Author xiao.yunfei
 * @Date 2020/5/15 13:34
 * @Desc
 */
@Data
@CustomInf(firstArgs="name",argsArray = {"phone","age"},message = "名称有值时，手机号和年龄不能为空")
public class CustomUser implements Serializable {
    private static final long serialVersionUID = 2594274431751408585L;
    @NotNull
    @Length(min = 2,max = 5,message = "名称长度2-5")
    private String name;

    private String phone;

    private String age;
}
