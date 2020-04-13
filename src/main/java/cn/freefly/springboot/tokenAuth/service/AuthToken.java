package cn.freefly.springboot.tokenAuth.service;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Author xiao.yunfei
 * @Description 表明需要验证Token的注解
 * @Date 2020/4/10 16:16
 * @Param 
 * @Return 
 */ 
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface AuthToken {
}
