package cn.freefly.springboot.async.service.impl;

import cn.freefly.springboot.async.service.AsyncService;
import cn.freefly.springboot.devUtils.DateUtil;
import cn.freefly.springboot.entity.BaseRes;
import cn.freefly.springboot.exception.SystemException;
import cn.freefly.springboot.httpClientUtil.entity.gj.CacmpGjNode;
import cn.freefly.springboot.httpClientUtil.mapper.gj.CacmpGjNodeMapper;
import cn.freefly.springboot.httpClientUtil.util.UniquenessFlagUnits;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
    @Autowired
    private CacmpGjNodeMapper cacmpGjNodeMapper;

    @Override
    @Async
    public void asyncTaskNoResValue() {
        long startTime = System.currentTimeMillis();
        try {
            //模拟耗时
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("异步请求线程名称："+Thread.currentThread().getName() + "：asyncTaskNoResValue，耗时：" + (endTime - startTime));
    }

    @Override
    @Async(value = "taskExecutor")
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

    @Override
    @Async(value = "taskExecutor")
    @Transactional
    public void asyncTaskForTransaction(boolean exFlag) {
        //新增一个用户
        CacmpGjNode node = new CacmpGjNode();
        node.setId(UniquenessFlagUnits.generateUniquenessFlag("NO"));
        node.setNodeNo("1");
        node.setInstNo("2");
        node.setNodeNumber("1");
        node.setOrderId("3");
        cacmpGjNodeMapper.insertSelective(node);
        if(exFlag){
            //模拟异常
            throw new SystemException("模拟异常");
        }
    }
}
