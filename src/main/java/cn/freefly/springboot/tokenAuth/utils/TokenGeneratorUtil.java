package cn.freefly.springboot.tokenAuth.utils;

import org.springframework.stereotype.Component;
import org.springframework.util.DigestUtils;

/**
 * @ClassNmae TokenGeneratorUtil
 * @Author xiao.yunfei
 * @Date 2020/4/12 22:09
 * @Desc
 */
@Component
public class TokenGeneratorUtil {
    public String generate(String... strings) {
        long timestamp = System.currentTimeMillis();
        String tokenMeta = "";
        for (String s : strings) {
            tokenMeta = tokenMeta + s;
        }
        tokenMeta = tokenMeta + timestamp;
        String token = DigestUtils.md5DigestAsHex(tokenMeta.getBytes());
        return token;
    }
}
