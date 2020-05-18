package cn.freefly.springboot.hibernateValidator.custom.entity;

import cn.freefly.springboot.hibernateValidator.custom.enums.CaseMode;
import cn.freefly.springboot.hibernateValidator.custom.interfaces.CheckCaseInf;
import lombok.Data;

/**
 * @ClassNmae CustomUser
 * @Author xiao.yunfei
 * @Date 2020/5/15 9:32
 * @Desc
 */
@Data
public class CheckCase {
    @CheckCaseInf(value = CaseMode.LOWER,message = "userName必须是小写")
    private String userName;
}
