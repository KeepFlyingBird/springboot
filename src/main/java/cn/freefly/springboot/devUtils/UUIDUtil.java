package cn.freefly.springboot.devUtils;

import java.util.UUID;

/**
 * @ClassNmae UUIDUtil
 * @Author xiao.yunfei
 * @Date 2020/3/5 22:32
 * @Desc
 */
public class UUIDUtil {
    /**
     * 生成随机UUID,不包含"-",统一转为小写
     */
    public static String uuidLower() {
        String regex = "-";
        String replacement = "";
        String result = UUID.randomUUID().toString().replaceAll(regex, replacement).toLowerCase();
        return result;
    }

    /**
     * 生成随机UUID,不包含"-",统一转为大写
     */
    public static String uuidUpper() {
        String regex = "-";
        String replacement = "";
        String result = UUID.randomUUID().toString().replaceAll(regex, replacement).toUpperCase();
        return result;
    }
}
