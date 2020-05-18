package cn.freefly.springboot.hibernateValidator.custom.interfaces;

import cn.freefly.springboot.hibernateValidator.custom.utils.CustomMethodInfValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = CustomMethodInfValidator.class)
public @interface CustomMethodInf {
    String message() default "";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

    String firstArgs();
    String[] argsArray();
}
