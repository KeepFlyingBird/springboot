package cn.freefly.exception;

import cn.freefly.exception.entity.ResultBody;
import cn.freefly.exception.enums.CommonEnum;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class GlobalExceptionHandler {
    private static final Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);
    /**
     * 处理自定义的业务异常
     * @param e
     * @return
     */
    @ExceptionHandler(value = MyException.class)
    @ResponseBody
    public ResultBody MyExceptionHandler(MyException e){
        logger.error("发生业务异常，原因是：{}",e.getErrorMsg());
        return ResultBody.error(e.getErrorCode(),e.getErrorMsg());
    }

    /**
     * 处理空指针的异常
     * @param e
     * @return
     */
    @ExceptionHandler(value =NullPointerException.class)
    @ResponseBody
    public ResultBody exceptionHandler(NullPointerException e){
        logger.error("发生空指针异常，原因是:"+e);
        return ResultBody.error(CommonEnum.NULL_POINTER.getResultCode(),CommonEnum.NULL_POINTER.getResultMsg()+"|"+e.getMessage());
    }

    /**
     * 处理其他异常
     * @param e
     * @return
     */
    @ExceptionHandler(value =Exception.class)
    @ResponseBody
    public ResultBody exceptionHandler(Exception e){
        logger.error("系统执行异常，原因是:",e);
        return ResultBody.error(CommonEnum.INTERNAL_SERVER_ERROR.getResultCode(),CommonEnum.INTERNAL_SERVER_ERROR.getResultMsg()+"|"+e.getMessage());
    }
}
