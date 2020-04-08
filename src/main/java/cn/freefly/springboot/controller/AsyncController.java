package cn.freefly.springboot.controller;

import cn.freefly.springboot.async.service.AsyncService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassNmae AsyncController
 * @Author xiao.yunfei
 * @Date 2019/11/24 16:50
 * @Desc
 */
@RestController
@RequestMapping("/async")
@Slf4j
public class AsyncController {

    // 注入异步服务接口
    @Autowired
    private AsyncService asyncService = null;
    @GetMapping("/test")
    public String asyncTest(){
        log.info("--------异步执行=");
        System.out.println("--Controller请求线程名称："+"【"+Thread.currentThread().getName()+"】");
        // 调用异步服务
        asyncService.testAsync();
        return "--Test--async==";
    }
}
