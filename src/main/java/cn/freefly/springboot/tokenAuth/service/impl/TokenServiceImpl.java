package cn.freefly.springboot.tokenAuth.service.impl;

import cn.freefly.springboot.httpClientUtil.dto.BaseResponse;
import cn.freefly.springboot.tokenAuth.dto.UserInfo;
import cn.freefly.springboot.tokenAuth.service.TokenService;
import cn.freefly.springboot.redis.util.RedisUtil;
import cn.freefly.springboot.tokenAuth.utils.TokenConstant;
import cn.freefly.springboot.tokenAuth.utils.TokenGeneratorUtil;
import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassNmae TokenServiceImpl
 * @Author xiao.yunfei
 * @Date 2020/4/12 22:15
 * @Desc
 */
@Service
@Slf4j
public class TokenServiceImpl implements TokenService {
    @Autowired
    private RedisUtil redisUtil;
    @Autowired
    private TokenGeneratorUtil tokenGeneratorUtil;
    @Override
    public BaseResponse login(UserInfo userInfo) {
        //1、生成token
        String token = tokenGeneratorUtil.generate(userInfo.getUserName(),userInfo.telPhone);
        //2、token存入内存
        redisUtil.set(token,userInfo.getUserName(), TokenConstant.TOKEN_EXPIRE_TIME);
        redisUtil.set(token+userInfo.getUserName(),System.currentTimeMillis());
        String userName = redisUtil.get(token).toString();
        log.info("userName:{},token:{}",userName,token);
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("token",token);
        return BaseResponse.createBaseResponse(true,jsonObject);
    }

    @Override
    public void query(String token) {
        log.info("token:{}",redisUtil.get(token));
    }
}
