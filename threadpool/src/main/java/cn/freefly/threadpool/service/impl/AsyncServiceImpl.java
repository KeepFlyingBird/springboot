package cn.freefly.threadpool.service.impl;

import cn.freefly.threadpool.service.AsyncService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Service;

import java.util.concurrent.Future;

/**
 * @ClassNmae AsyncServiceImpl
 * @Author xiao.yunfei
 * @Date 2019/11/24 16:46
 * @Desc
 */
@Service
@Slf4j
public class AsyncServiceImpl implements AsyncService {

    @Override
    @Async
    public void asyncTaskNoResValue() {
        long startTime = System.currentTimeMillis();
        try {
            //模拟耗时
            Thread.sleep(8000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("异步请求线程名称："+Thread.currentThread().getName() + "：asyncTaskNoResValue，耗时：" + (endTime - startTime));
    }

    @Override
    @Async(value = "threadPoolTaskExecutor")
    public Future<String> asyncTaskResValue(String str) {
        long startTime = System.currentTimeMillis();
        try {
            //模拟耗时
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("异步请求线程名称："+Thread.currentThread().getName() + "：asyncTaskResValue，耗时：" + (endTime - startTime));
        return AsyncResult.forValue(str);
    }
}
