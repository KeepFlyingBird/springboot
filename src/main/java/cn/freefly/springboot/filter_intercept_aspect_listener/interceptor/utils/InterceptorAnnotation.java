package cn.freefly.springboot.filter_intercept_aspect_listener.interceptor.utils;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
/**
 * @Author xiao.yunfei
 * @Description 在需要拦截的Controller方法上使用此注解
 * @Date 2020/4/21 16:01
 */
@Target({ElementType.METHOD})//可用在方法名上
@Retention(RetentionPolicy.RUNTIME)//运行时有效
public @interface InterceptorAnnotation {
}
