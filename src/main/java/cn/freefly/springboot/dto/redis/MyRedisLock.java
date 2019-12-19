package cn.freefly.springboot.dto.redis;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

/**
 * @ClassNmae MyRedisLock
 * @Author xiao.yunfei
 * @Date 2019/11/19 17:59
 * @Desc
 */
public class MyRedisLock {
    //初始化redis池
    private static JedisPoolConfig config;
    private static JedisPool pool;
    @Value("${spring.redis.host}")
    public static String host;
    @Value("${spring.redis.port}")
    public static int port;
    static {
        config = new JedisPoolConfig();
        pool = new JedisPool(config, host, port);
    }

    /**
     * 给target上锁
     * @param target
     */
    public static void lock(Object target) {
        System.out.println("--------host="+host+"------port="+port);
        //获取jedis
        Jedis jedis = pool.getResource();
        //result接收setnx的返回值，初始值为0
        Long result= 0L;
        while (result < 1) {
            //如果target在redis中已经存在，则返回0；否则，在redis中设置target键值对，并返回1
            result = jedis.setnx(target.getClass().getName() + target.hashCode(), Thread.currentThread().getName());
        }

        jedis.close();
    }

    /**
     * 给target解锁
     * @param target
     */
    public static void unLock(Object target) {

        Jedis jedis = pool.getResource();
        //删除redis中target对象的键值对
        Long del = jedis.del(target.getClass().getName() + target.hashCode());
        jedis.close();
    }

    /**
     * 尝试给target上锁，如果锁成功返回true，如果锁失败返回false
     * @param target
     * @return
     */
    public static boolean tryLock(Object target) {

        Jedis jedis = pool.getResource();
        Long row = jedis.setnx(target.getClass().getName() + target.hashCode(), "true");
        jedis.close();
        if (row > 0) {
            return true;
        }
        return false;
    }
}
