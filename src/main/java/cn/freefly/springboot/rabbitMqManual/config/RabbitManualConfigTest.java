package cn.freefly.springboot.rabbitMqManual.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.amqp.rabbit.core.RabbitAdmin;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author xiao.yunfei
 * @Date 2019/12/15 16:25
 * @MethodParameters
 * @Description
*/
@Configuration
@AutoConfigureAfter(RabbitManualConfig.class)
public class RabbitManualConfigTest {
    private static final Logger logger = LoggerFactory.getLogger(RabbitManualConfigTest.class);

    @Value("${queue.manual.test}")
    private String queueTest;

    @Value("${exchange.manual.test}")
    private String exchangeTest;

    @Value("${routingKey.manual.test}")
    private String routingKeyTest;

    /**
     * @Author xiao.yunfei
     * @Date 2019/12/13 18:58
     * @MethodParameters
     * @Description 主题交换机实例化
    */
    @Bean("topicExchangeManualTest")
    TopicExchange topicExchangeManualTest(@Qualifier("baseRabbitManualAdmin") RabbitAdmin rabbitAdmin){
        TopicExchange topicExchange = new TopicExchange(exchangeTest);
        rabbitAdmin.declareExchange(topicExchange);
        logger.debug("testRabbitMq:主题型交换机bean实例化");
        return topicExchange;
    }

    @Bean("queueManualTest")
    Queue queueManualTest(@Qualifier("baseRabbitManualAdmin") RabbitAdmin rabbitAdmin){
        Queue queue = new Queue(queueTest);
        rabbitAdmin.declareQueue(queue);
        logger.debug("testRabbitMq:队列Bean实例化");
        return queue;
    }

    @Bean("bindingQueueManualTest")
    Binding bindingQueueManualTest(@Qualifier("queueManualTest") Queue queueTest, @Qualifier("topicExchangeManualTest") TopicExchange topicExchangeTest, @Qualifier("baseRabbitManualAdmin") RabbitAdmin rabbitAdmin){
        Binding binding = BindingBuilder.bind(queueTest).to(topicExchangeTest).with(routingKeyTest);
        rabbitAdmin.declareBinding(binding);
        logger.debug("testRabbitMq:队列与主题型交换机绑定完成");
        return binding;
    }

}
