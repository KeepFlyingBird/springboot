package cn.freefly.springboot.hibernateValidator.custom.interfaces;

import cn.freefly.springboot.hibernateValidator.custom.utils.CustomInfValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = CustomInfValidator.class)
public @interface CustomInf {
    String message() default "";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

    String firstArgs();

    String[] argsArray();
}
