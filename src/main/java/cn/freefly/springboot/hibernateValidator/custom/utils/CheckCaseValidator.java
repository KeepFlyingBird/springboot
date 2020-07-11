package cn.freefly.springboot.hibernateValidator.custom.utils;

import cn.freefly.springboot.hibernateValidator.custom.enums.CaseMode;
import cn.freefly.springboot.hibernateValidator.custom.interfaces.CheckCaseInf;
import lombok.extern.slf4j.Slf4j;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * @ClassNmae CheckCaseValidator
 * @Author xiao.yunfei
 * @Date 2020/5/15 9:24
 * @Desc
 */
@Slf4j
public class CheckCaseValidator implements ConstraintValidator<CheckCaseInf, String> {
    private CaseMode caseMode;

    @Override
    public void initialize(CheckCaseInf checkCase) {
        this.caseMode = checkCase.value();
    }

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        System.out.println("验证："+s);
        if (s == null) {
            return true;
        }

        if (caseMode == CaseMode.UPPER) {
            System.out.println("大写："+s.toLowerCase());
            return s.equals(s.toUpperCase());
        } else {
            System.out.println("小写："+s.toLowerCase());
            return s.equals(s.toLowerCase());
        }
    }
}
