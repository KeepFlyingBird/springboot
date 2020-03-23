package cn.freefly.springboot;

import cn.freefly.springboot.devUtils.DateUtil;
import cn.freefly.springboot.devUtils.RSAUtils;
import cn.freefly.springboot.redis.service.RedisService;
import cn.freefly.springboot.redis.util.SequenceUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootApplicationTests {
    @Autowired
    RedisService redisService;
    @Test
    public void contextLoads() {
    }
    @Test
    public void autoFlowCode() {
        String currentDate = new SimpleDateFormat("yyyyMMdd").format(new Date());
        Long num = redisService.getIncrementNum("demo_get_the_new_" + "test3_"+currentDate);
        String flowCode = SequenceUtils.getSequence(num);
        System.out.println("流水号: " + flowCode);
    }
    @Test
    public void testPublicKey(){
        Map<String, String> keyMap = RSAUtils.createKeys(512);
        String  publicKey = keyMap.get("publicKey");
        String  privateKey = keyMap.get("privateKey");
        System.out.println("公钥: \n\r" + publicKey);
        System.out.println("私钥： \n\r" + privateKey);
    }
}
