package cn.freefly.springboot.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @ClassNmae BaseRes
 * @Author xiao.yunfei
 * @Date 2020/1/6 15:37
 * @Desc
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BaseRes {
    private boolean flag;
    private String resMsg ;
    private Object resData;


    public static BaseRes success(String responseMsg) {
        return success(null, responseMsg);
    }

    public static BaseRes success(Object data, String responseMsg) {
        BaseRes res = new BaseRes();
        res.setFlag(true);
        res.setResData(data);
        res.setResMsg(responseMsg);
        return res;
    }

    public static BaseRes fail(String responseMsg) {
        return fail(null, responseMsg);
    }

    public static BaseRes fail(Object data, String responseMsg) {
        BaseRes res = new BaseRes();
        res.setFlag(false);
        res.setResData(data);
        res.setResMsg(responseMsg);
        return res;
    }
}
