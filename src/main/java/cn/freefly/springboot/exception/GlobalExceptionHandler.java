package cn.freefly.springboot.exception;

import cn.freefly.springboot.entity.BaseRes;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.jws.WebResult;

/**
 * @ClassNmae GlobalExceptionHandler
 * @Author xiao.yunfei
 * @Date 2020/5/11 15:44
 * @Desc
 */
@ControllerAdvice
public class GlobalExceptionHandler {
    //处理自定义的异常
    @ExceptionHandler(SystemException.class)
    @ResponseBody
    public BaseRes customHandler(SystemException e){
        e.printStackTrace();
        return BaseRes.fail(e.getMessage());
    }

    //其他未处理的异常
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public BaseRes exceptionHandler(Exception e){
        e.printStackTrace();
        return BaseRes.fail(e.getMessage());
    }
}
