package cn.freefly.springboot.devUtils;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.SOURCE)
@Target(value = ElementType.FIELD)
public @interface FieldDesc {
    String value();
}
