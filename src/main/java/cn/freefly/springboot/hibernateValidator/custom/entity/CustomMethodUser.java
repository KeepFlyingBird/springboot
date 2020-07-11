package cn.freefly.springboot.hibernateValidator.custom.entity;

import cn.freefly.springboot.hibernateValidator.custom.interfaces.CustomMethodInf;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotNull;

/**
 * @ClassNmae CustomMethodUser
 * @Author xiao.yunfei
 * @Date 2020/5/18 11:25
 * @Desc
 */
@Data
public class CustomMethodUser {
    private static final long serialVersionUID = 2594274431751408585L;
    @NotNull
    @Length(min = 2,max = 5,message = "名称长度2-5")
    private String name;

    private String phone;

    private String age;

    private String sex;

    @CustomMethodInf(firstArgs = "phone",argsArray = {"sex"},message = "测试方法注解")
    public String checkSex(String phone){
        if(StringUtils.isEmpty(phone)){

        }
        return "手机号：" + phone + ",性别：" + sex;
    }
}
