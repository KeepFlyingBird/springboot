package cn.freefly.springboot.rabbitMqManual.producer;

import cn.freefly.springboot.rabbitMqManual.dto.TestManualSendObj;
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
public class TestManualProducer implements RabbitTemplate.ConfirmCallback{
    private static final Logger logger = LoggerFactory.getLogger(TestManualProducer.class);

    @Resource(name="baseRabbitManualTemplate")
    private RabbitTemplate rabbitTemplate;

    @Value("${queue.manual.test}")
    private String queueTest;

    @Value("${exchange.manual.test}")
    private String exchangeTest;

    @Value("${routingKey.manual.test}")
    private String routingKeyTest;


    public void sendMsgTest(TestManualSendObj sendObj){
        CorrelationData correlationData = new CorrelationData(UUID.randomUUID().toString());
        logger.info("manualProducer发送correlationData: " + correlationData.getId());
        this.rabbitTemplate.convertAndSend(exchangeTest, routingKeyTest , sendObj, correlationData);
    }

    @Override
    public void confirm(CorrelationData correlationData, boolean ack, String cause) {
        logger.info("confirm: " + correlationData.getId()+" ,ack: "+ack+" ,cause: "+cause);logger.info("confirm: " + correlationData.getId()+" ,ack: "+ack+" ,cause: "+cause);
    }
}
