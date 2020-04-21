package cn.freefly.springboot.interceptor.interceptor;

import cn.freefly.springboot.interceptor.utils.InterceptorAnnotation;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.Method;

/**
 * @ClassNmae TemplateInterceptor
 * @Author xiao.yunfei
 * @Date 2020/4/21 15:47
 * @Desc
 */
public class TemplateInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        if (!(handler instanceof HandlerMethod)) {
            return true;
        }
        HandlerMethod handlerMethod = (HandlerMethod) handler;
        Method method = handlerMethod.getMethod();
        if(method.getAnnotation(InterceptorAnnotation.class) != null){
            //拦截请求，写业务逻辑
            //1、读取Header中指定参数值
            request.getHeader("");
            //2、读取请求参数中指定参数值
            request.getParameter("");
            //3、若校验失败，返回前端Json串
        }
        return true;
    }
}
