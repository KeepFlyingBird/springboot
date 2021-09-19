package cn.freefly.exception.entity;

import cn.freefly.exception.enums.CommonEnum;

public class ResultBody {
    /**
     * 响应代码
     */
    private String code;

    /**
     * 响应消息
     */
    private String message;

    /**
     * 响应结果
     */
    private Object result;

    public ResultBody() {
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }

    public static ResultBody success(String msg) {
        return success(msg, null);
    }

    public static ResultBody success(String msg, Object data) {
        ResultBody rb = new ResultBody();
        rb.setCode(CommonEnum.SUCCESS.getResultCode());
        rb.setMessage(msg);
        rb.setResult(data);
        return rb;
    }

    public static ResultBody error(String code, String msg) {
        return error(code, msg, null);
    }

    public static ResultBody error(String code, String msg, Object obj) {
        ResultBody rb = new ResultBody();
        rb.setCode(code);
        rb.setMessage(msg);
        rb.setResult(obj);
        return rb;
    }

}
