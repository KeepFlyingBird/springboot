package cn.freefly.springboot.hibernateValidator.custom.utils;

import cn.freefly.springboot.hibernateValidator.custom.interfaces.CustomInf;
import cn.freefly.springboot.hibernateValidator.custom.interfaces.CustomMethodInf;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * @ClassNmae CustomMethodInfValidator
 * @Author xiao.yunfei
 * @Date 2020/5/18 11:29
 * @Desc
 */
public class CustomMethodInfValidator implements ConstraintValidator<CustomMethodInf,Object> {
    private String firstArgs;
    private String[] argsArray;
    @Override
    public void initialize(CustomMethodInf customMethodInf) {
        firstArgs = customMethodInf.firstArgs();
        argsArray = customMethodInf.argsArray();
    }

    @Override
    public boolean isValid(Object o, ConstraintValidatorContext constraintValidatorContext) {
        System.out.println("对象："+o);
        return false;
    }
}
