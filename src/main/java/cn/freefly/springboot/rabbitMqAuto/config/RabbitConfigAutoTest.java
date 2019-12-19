package cn.freefly.springboot.rabbitMqAuto.config;

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
 * @ClassNmae RabbitConfigTest
 * @Author xiao.yunfei
 * @Date 2019/12/13 18:54
 * @Desc
 */
@Configuration
@AutoConfigureAfter(RabbitConfigAuto.class)
public class RabbitConfigAutoTest {
    private static final Logger logger = LoggerFactory.getLogger(RabbitConfigAutoTest.class);

    @Value("${queue.test}")
    private String queueTest;

    @Value("${exchange.test}")
    private String exchangeTest;

    @Value("${routingKey.test}")
    private String routingKeyTest;

    /**
     * @Author xiao.yunfei
     * @Date 2019/12/13 18:58
     * @MethodParameters
     * @Description 主题交换机实例化
    */
    @Bean
    TopicExchange topicExchangeTest(@Qualifier("baseRabbitAdmin") RabbitAdmin rabbitAdmin){
        TopicExchange topicExchange = new TopicExchange(exchangeTest);
        rabbitAdmin.declareExchange(topicExchange);
        logger.debug("testRabbitMq:主题型交换机bean实例化");
        return topicExchange;
    }
    /**
     * @Author xiao.yunfei
     * @Date 2019/12/17 19:56
     * @MethodParameters
     * @Description 消息队列实例化
    */
    @Bean
    Queue queueTest(@Qualifier("baseRabbitAdmin") RabbitAdmin rabbitAdmin){
        Queue queue = new Queue(queueTest);
        rabbitAdmin.declareQueue(queue);
        logger.debug("testRabbitMq:队列Bean实例化");
        return queue;
    }
    /**
     * @Author xiao.yunfei
     * @Date 2019/12/17 19:56
     * @MethodParameters
     * @Description 绑定实例化类
    */
    @Bean
    Binding bindingQueueTest(Queue queueTest, TopicExchange topicExchangeTest, @Qualifier("baseRabbitAdmin") RabbitAdmin rabbitAdmin){
        Binding binding = BindingBuilder.bind(queueTest).to(topicExchangeTest).with(routingKeyTest);
        rabbitAdmin.declareBinding(binding);
        logger.debug("testRabbitMq:队列与主题型交换机绑定完成");
        return binding;
    }

}
