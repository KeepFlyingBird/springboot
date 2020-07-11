package cn.freefly.springboot.hibernateValidator.groupValidator.entity;

import cn.freefly.springboot.hibernateValidator.groupValidator.interfaces.GroupA;
import cn.freefly.springboot.hibernateValidator.groupValidator.interfaces.GroupB;
import lombok.Data;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.groups.Default;

/**
 * @ClassNmae GroupPerson
 * @Author xiao.yunfei
 * @Date 2020/5/14 19:48
 * @Desc
 */
@Data
public class GroupPerson {
    @Range(min = 1,max = Integer.MAX_VALUE,message = "userId必须大于0",groups = {GroupA.class})
    private Integer userId;
    @Length(min = 4,max = 20,message = "userName必须在[4,20]",groups = {GroupB.class})
    private String userName;
    @Range(min = 0,max = 100,message = "age年龄必须在[0,100]",groups={Default.class})
    private Integer age;
    /**性别 0：未知；1：男；2：女*/
    @Range(min = 0,max = 2,message = "sex性别必须在[0,2]",groups = {GroupB.class})
    private Integer sex;
}
