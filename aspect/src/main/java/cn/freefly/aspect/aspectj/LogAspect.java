package cn.freefly.aspect.aspectj;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Slf4j
@Aspect
public class LogAspect {

    // 配置织入点
    @Pointcut("@annotation(cn.freefly.aspect.annotation.Log)")
    public void logPointCut()
    {
    }

    /**
     * returning解释：
     *  该属性指定一个形参名，用于表示Advice方法中可定义与此同名的形参，该形参可用于访问目标方法的返回值。
     *  除此之外，在Advice方法中定义该形参（代表目标方法的返回值）时指定的类型，会限制目标方法必须返回指定类型的值或没有返回值
     * @param joinPoint
     * @param resVal
     */
    @AfterReturning(pointcut = "logPointCut()",returning = "resVal")
    public void doAfterReturning(JoinPoint joinPoint,Object resVal){

        handleLog(joinPoint,null,resVal);
    }

    /**
     * throwing 同上述-returning
     * @param joinPoint
     * @param exception
     */
    @AfterThrowing(value = "logPointCut()", throwing = "exception")
    public void doAfterThrowing(JoinPoint joinPoint, Exception exception)
    {
        handleLog(joinPoint,exception,null);
    }

    protected void handleLog(final JoinPoint joinPoint, final Exception exception, Object resVal){

    }
}
