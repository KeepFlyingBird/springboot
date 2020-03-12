package cn.freefly.springboot.devUtils.error;

public class ValidateException extends RuntimeException {

    public ValidateException(String message) {
        super(message);
    }

    public ValidateException(String message, Throwable e) {
        super(message, e);
    }
}
