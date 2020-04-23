package cn.freefly.springboot.filter_intercept_aspect_listener.aspect;

import cn.freefly.springboot.devUtils.JsonUtil;
import cn.freefly.springboot.tokenAuth.dto.UserInfo;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Slf4j
public class ValidateAspect {

    @Pointcut("execution(public * cn.freefly.springboot.controller..*.*(..))")
    public void Pointcut() {
    }

    //@Around：环绕通知
    @Around("Pointcut()")
    public Object Around(ProceedingJoinPoint pjp) throws Throwable {
        log.info("around执行方法之前");
        Object[] args = beforeExecute(pjp);
        Object object = pjp.proceed(args);
        log.info("around执行方法之后--返回值：" + object);
        return object;
    }

    private Object[] beforeExecute(ProceedingJoinPoint pjp) {
        Object[] args = pjp.getArgs();

        for (Object obj : args) {
            if(obj instanceof UserInfo){
                log.info("请求参数：{}", JsonUtil.toJson(obj));
                log.info("----执行方法--------");
            }
        }
        return args;
    }

}
