package cn.freefly.springboot.devUtils;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.util.IOUtils;
import com.alibaba.fastjson.util.TypeUtils;
import org.springframework.util.StringUtils;

/**
 * @ClassNmae JsonUtil
 * @Author xiao.yunfei
 * @Date 2020/3/6 11:34
 * @Desc
 */
public class JsonUtil {
    /**
     * @Author xiao.yunfei
     * @Date 2020/3/6 11:49
     * @MethodParameters
     * @Description 对象转Json字符串
    */
    public static String toJson(Object obj) {
        if (obj == null) {
            return null;
        }
        return JSONObject.toJSONString(obj);
    }
    /**
     * @Author xiao.yunfei
     * @Date 2020/3/6 11:51
     * @MethodParameters
     * @Description Json字符串转对象T
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
