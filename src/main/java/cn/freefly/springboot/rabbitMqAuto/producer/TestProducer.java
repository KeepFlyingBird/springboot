package cn.freefly.springboot.rabbitMqAuto.producer;

import cn.freefly.springboot.rabbitMqAuto.dto.TestSendObj;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.connection.CorrelationData;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.UUID;

/**
 * @ClassNmae TestProducer
 * @Author xiao.yunfei
 * @Date 2019/12/13 14:03
 * @Desc 生产者-测试
 */
@Component
public class TestProducer {
    private static final Logger logger = LoggerFactory.getLogger(TestProducer.class);

    @Resource(name="baseRabbitTemplate")
    private RabbitTemplate rabbitTemplate;

    @Value("${queue.test}")
    private String queueTest;

    @Value("${exchange.test}")
    private String exchangeTest;

    @Value("${routingKey.test}")
    private String routingKeyTest;


    public void sendMsgTest(TestSendObj sendObj){
        CorrelationData correlationData = new CorrelationData(UUID.randomUUID().toString());
        logger.info("producer发送correlationData: " + correlationData.getId());
        this.rabbitTemplate.convertAndSend(exchangeTest, routingKeyTest , sendObj, correlationData);
    }

}
