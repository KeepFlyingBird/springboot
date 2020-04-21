package cn.freefly.springboot.controller;

import cn.freefly.springboot.httpClientUtil.dto.BaseResponse;
import cn.freefly.springboot.tokenAuth.dto.UserInfo;
import cn.freefly.springboot.interceptor.utils.AuthToken;
import cn.freefly.springboot.tokenAuth.service.TokenService;
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
    @RequestMapping(value = "/query", method = RequestMethod.POST)
    public String querytoken(@RequestParam String token) {
        System.out.println("权限通过验证"+token);
        tokenService.query(token);
        return "成功";
    }
    /**
     * 加了权限注解的方法
     * @return
     */
    @AuthToken
    @RequestMapping(value = "/tokenBody", method = RequestMethod.POST)
    public String tokenBody(@RequestBody UserInfo userInfo) {
        System.out.println("权限通过验证"+userInfo.getUserName()+":"+userInfo.getTelPhone());
        return "成功";
    }
}
