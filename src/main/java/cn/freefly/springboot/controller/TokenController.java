package cn.freefly.springboot.controller;

import cn.freefly.springboot.httpClientUtil.dto.BaseResponse;
import cn.freefly.springboot.tokenAuth.dto.UserInfo;
import cn.freefly.springboot.tokenAuth.service.AuthToken;
import cn.freefly.springboot.tokenAuth.service.TokenService;
import cn.freefly.springboot.tokenAuth.utils.RedisUtil;
import cn.freefly.springboot.tokenAuth.utils.TokenConstant;
import cn.freefly.springboot.tokenAuth.utils.TokenGeneratorUtil;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @ClassNmae TokenController
 * @Author xiao.yunfei
 * @Date 2020/4/10 16:27
 * @Desc
 */
@RestController
public class TokenController {
    @Autowired
    private TokenService tokenService;
    /**
     * 登录的控制方法
     * @return
     */
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public BaseResponse login(@RequestBody UserInfo userInfo) {
        return tokenService.login(userInfo);
    }

    /**
     * 加了权限注解的方法
     * @return
     */
    @AuthToken
    @ResponseBody
    @RequestMapping(value = "/testtoken", method = RequestMethod.GET)
    public String testtoken() {
        System.out.println("权限通过验证");
        return "成功";
    }
}
