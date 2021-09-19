package cn.freefly.redis.controller;

import cn.freefly.redis.service.RedissonLockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Description:
 * @author: xhzl.xiaoyunfei
 * @date: 2021.09.14
 */
@Controller
public class RedissonLockController {
    @Autowired
    public RedissonLockService service;

    @RequestMapping("/lockTest")
    @ResponseBody
    public void lockTest(){
        service.doLock("lockTest");
    }
}
