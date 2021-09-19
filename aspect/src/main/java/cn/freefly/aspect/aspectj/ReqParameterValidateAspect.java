package cn.freefly.aspect.aspectj;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Slf4j
@Aspect
public class ReqParameterValidateAspect {
    // 配置织入点
    @Pointcut("@annotation(cn.freefly.aspect.annotation.ReqParameterValidate)")
    public void reqParameterValidatePointCut()
    {
    }

    /**
     * returning解释：
     *  该属性指定一个形参名，用于表示Advice方法中可定义与此同名的形参，该形参可用于访问目标方法的返回值。
     *  除此之外，在Advice方法中定义该形参（代表目标方法的返回值）时指定的类型，会限制目标方法必须返回指定类型的值或没有返回值
     * @param joinPoint
     */
    @Before("reqParameterValidatePointCut()")
    public void doAfterReturning(JoinPoint joinPoint){
        handleReqParameter(joinPoint);
    }


    protected void handleReqParameter(final JoinPoint joinPoint){

    }

}
