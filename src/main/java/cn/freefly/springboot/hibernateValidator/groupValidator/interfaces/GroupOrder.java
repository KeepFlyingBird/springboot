package cn.freefly.springboot.hibernateValidator.groupValidator.interfaces;

import javax.validation.GroupSequence;
import javax.validation.groups.Default;

/**
 * @Author xiao.yunfei
 * @Description 分组顺序校验时，按指定的分组先后顺序进行验证，前面的验证不通过，后面的分组就不行验证
 * @Date 2020/5/14 20:18
 * @Param 
 * @Return 
 */ 
@GroupSequence({GroupA.class,GroupB.class, Default.class})
public interface GroupOrder {
}
