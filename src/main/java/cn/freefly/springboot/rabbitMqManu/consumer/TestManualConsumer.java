package cn.freefly.springboot.rabbitMqManu.consumer;

import cn.freefly.springboot.rabbitMqManu.dto.TestManualSendObj;
import cn.freefly.springboot.rabbitMqManu.utils.JsonUtil;
import com.rabbitmq.client.Channel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @ClassNmae TestConsumer
 * @Author xiao.yunfei
 * @Date 2019/12/13 14:03
 * @Desc 消费者-测试
 */
//@Configuration
//@AutoConfigureAfter(RabbitConfig.class)
@Component
public class TestManualConsumer {
    private static final Logger logger = LoggerFactory.getLogger(TestManualConsumer.class);

    @RabbitListener(queues={"${queue.manual.test}"},containerFactory = "baseManualRabbitListenerContainerFactory")
    private void receiveMsgTest(final Message message, Channel channel){
        try {
            String msg = new String(message.getBody(), "UTF-8");
            TestManualSendObj sendObj = JsonUtil.parseObject(msg, TestManualSendObj.class);
            logger.info("testManualConsumer接收数据：orderNo="+sendObj.getOrderNo()+", userName="+sendObj.getUserName()+", age="+sendObj.getAge());
            channel.basicAck(message.getMessageProperties().getDeliveryTag(),false);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
