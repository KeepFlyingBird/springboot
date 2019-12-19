package cn.freefly.springboot.async.service.impl;

import cn.freefly.springboot.async.service.AsyncService;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * @ClassNmae AsyncServiceImpl
 * @Author xiao.yunfei
 * @Date 2019/11/24 16:46
 * @Desc
 */
@Service
public class AsyncServiceImpl implements AsyncService {
    @Override
    @Async // 声明使用异步调用
    public void testAsync() {
        System.out.println("--impl请求线程名称："+"【"+Thread.currentThread().getName()+"】");
    }
}
