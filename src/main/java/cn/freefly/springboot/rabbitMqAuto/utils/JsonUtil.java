package cn.freefly.springboot.rabbitMqAuto.utils;

import com.alibaba.fastjson.JSONObject;
import org.springframework.util.StringUtils;

/**
 * @ClassNmae JsonUtil
 * @Author xiao.yunfei
 * @Date 2019/12/13 15:04
 * @Desc
 */
public class JsonUtil {
    /**
     * @Author xiao.yunfei
     * @Date 2019/12/13 19:31
     * @MethodParameters
     * @Description 对象转Json字符串
    */
    public static String toJson(Object obj){
        if(null == obj){
            return null;
        }
        return JSONObject.toJSONString(obj);
    }
    /**
     * @Author xiao.yunfei
     * @Date 2019/12/13 19:31
     * @MethodParameters
     * @Description Json字符串 转对象T
    */
    public static <T> T parseObject(String json, Class<T> clazz) {
        if (StringUtils.isEmpty(json)) {
            return null;
        }
        T result = null;
            result = JSONObject.parseObject(json, clazz);
            return result;
    }
}
