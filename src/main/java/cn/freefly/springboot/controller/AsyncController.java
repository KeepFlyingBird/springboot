package cn.freefly.springboot.controller;

import cn.freefly.springboot.async.service.AsyncService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.Future;

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
    @Autowired
    private AsyncService asyncService;

    /**
     * 异步测试，无返回值
     */
    @GetMapping("/asyncTaskNoResValue")
    public void asyncTaskNoResValue(){
        long startTime = System.currentTimeMillis();
        System.out.println("AsyncController线程名称："+Thread.currentThread().getName() + "：开始调用异步业务");
        // 调用异步服务
        asyncService.asyncTaskNoResValue();
        long endTime = System.currentTimeMillis();
        System.out.println("AsyncController线程名称："+Thread.currentThread().getName() + "：调用异步业务结束，耗时：" + (endTime - startTime));
    }

    /**
     * 异步测试，有返回值
     * @return
     */
    @GetMapping("/asyncTaskResValue")
    public String asyncTaskResValue(){
        long startTime = System.currentTimeMillis();
        System.out.println("AsyncController线程名称："+Thread.currentThread().getName() + "：开始调用异步业务");//有返回值，但主线程不需要用到返回值
        // 调用异步服务
        Future resValue = asyncService.asyncTaskResValue("有返回值");
        long endTime = System.currentTimeMillis();
        System.out.println("AsyncController线程名称："+Thread.currentThread().getName() + "：调用异步业务结束，耗时：" + (endTime - startTime));
        return "";
    }

    /**
     * 异步测试，事务测试
     */
    @GetMapping("/asyncTaskForTransaction")
    public void asyncTaskForTransaction(boolean flag){
        long startTime = System.currentTimeMillis();
        System.out.println("AsyncController线程名称："+Thread.currentThread().getName() + "：开始调用异步业务");//有返回值，但主线程不需要用到返回值
        // 调用异步服务
        asyncService.asyncTaskForTransaction(flag);
        long endTime = System.currentTimeMillis();
        System.out.println("AsyncController线程名称："+Thread.currentThread().getName() + "：调用异步业务结束，耗时：" + (endTime - startTime));
    }
}
