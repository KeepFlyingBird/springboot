package cn.freefly.springboot.rabbitMqAuto.consumer;

import cn.freefly.springboot.rabbitMqAuto.dto.TestSendObj;
import cn.freefly.springboot.rabbitMqAuto.utils.JsonUtil;
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
@Component //实例化到spring容器中
public class TestConsumerAuto {
    private static final Logger logger = LoggerFactory.getLogger(TestConsumerAuto.class);

    @RabbitListener(queues={"${queue.test}"},containerFactory = "baseRabbitListenerContainerFactory")
    private void receiveMsgTest(final Message message, Channel channel){
        try {
            String msg = new String(message.getBody(), "UTF-8");
            TestSendObj sendObj = JsonUtil.parseObject(msg, TestSendObj.class);
            logger.info("testConsumer接收数据：orderNo="+sendObj.getOrderNo()+", userName="+sendObj.getUserName()+", age="+sendObj.getAge());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
