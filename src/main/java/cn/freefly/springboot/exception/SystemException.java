package cn.freefly.springboot.exception;

/**
 * @ClassNmae SystemException
 * @Author xiao.yunfei
 * @Date 2020/5/11 15:45
 * @Desc
 */
public class SystemException extends RuntimeException{
    public SystemException(String message) {
        super(message);
    }
}
