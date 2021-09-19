package cn.freefly.redis.service;

import jdk.nashorn.internal.runtime.logging.Logger;
import org.redisson.RedissonTimeSeries;
import org.redisson.api.RLock;
import org.redisson.api.RedissonClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * @Description:
 * @author: xhzl.xiaoyunfei
 * @date: 2021.09.14
 */
@Service
public class RedissonLockService {
    @Autowired
    private StringRedisTemplate rt;

    @Autowired
    @Qualifier("myRedissonClient")
    private RedissonClient redissonClient;

    public void doLock(String lockName){
        System.out.println("inter...");
        RLock rlock = redissonClient.getLock(lockName);//从RedissonClient取得Rlock实例
        rlock.lock(3, TimeUnit.SECONDS);//尝试取锁，有效期为3s，到期后自动释放。如果取得锁继续执行。取锁失败则自
        System.out.println(Thread.currentThread().getName()+",取得锁");
        int store=Integer.valueOf(rt.opsForValue().get("store"));//redis中读取store值
        if(store > 0){
            System.out.printf("售出1,当前库存为%d\n",--store);
            rt.opsForValue().set("store",String.valueOf(store));
        }else {
            System.out.println("已售完，下次再来吧");
        }
        rlock.unlock();//业务完成，释放锁
        System.out.println("解锁");
    }
}
