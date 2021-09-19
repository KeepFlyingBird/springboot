package cn.freefly.redis.config;

import org.redisson.Redisson;
import org.redisson.api.RedissonClient;
import org.redisson.config.Config;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashSet;
import java.util.Set;

/**
 * @Description: RedissionLock配置
 * @author: xhzl.xiaoyunfei
 * @date: 2021.09.14
 */
@Configuration
public class RedissonLockConfig {
    @Bean("myRedissonClient")
    public RedissonClient myRedissionClient(){
        Config config = new Config();
        config.useMasterSlaveServers()
                .setMasterAddress("redis://192.168.10.203:6379").setPassword("myRedis")//设置redis主节点
                .addSlaveAddress("redis://192.168.10.207:6379").setPassword("myRedis")
                .addSlaveAddress("redis://192.168.10.210:6379").setPassword("myRedis");//设置redis从节点
        return Redisson.create(config);
    }
}
