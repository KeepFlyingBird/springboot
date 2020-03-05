package cn.freefly.springboot.redis.util;

import lombok.extern.slf4j.Slf4j;

/**
 * @ClassNmae SequenceUtils
 * @Author xiao.yunfei
 * @Date 2020/3/3 22:48
 * @Desc
 */
@Slf4j
public class SequenceUtils {
    static final int DEFAULT_LENGTH = 6;

    public static String getSequence(long seq) {
        String str = String.valueOf(seq);
        log.info(seq+"----str="+str);
        int len = str.length();
        if (len >= DEFAULT_LENGTH) {// 取决于业务规模,应该不会到达3
            return str;
        }
        int rest = DEFAULT_LENGTH - len;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < rest; i++) {
            sb.append('0');
        }
        sb.append(str);
        return sb.toString();
    }
}
