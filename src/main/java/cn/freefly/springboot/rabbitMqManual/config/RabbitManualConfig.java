package cn.freefly.springboot.rabbitMqManual.config;

import org.springframework.amqp.core.AcknowledgeMode;
import org.springframework.amqp.rabbit.config.SimpleRabbitListenerContainerFactory;
import org.springframework.amqp.rabbit.connection.CachingConnectionFactory;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitAdmin;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.amqp.SimpleRabbitListenerContainerFactoryConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/**
 * @ClassNmae RabbitConfig
 * @Author xiao.yunfei
 * @Date 2019/12/12 21:20
 * @Desc
 */
@Configuration
public class RabbitManualConfig {
    @Bean("baseRabbitManualConnFactory")
    public ConnectionFactory baseRabbitManualConnFactory(
            @Value("${spring.rabbitmq.host}") String host,
            @Value("${spring.rabbitmq.port}") int port,
            @Value("${spring.rabbitmq.username}") String username,
            @Value("${spring.rabbitmq.password}") String password,
            @Value("${spring.rabbitmq.virtual-host}") String vHost){
        CachingConnectionFactory connFactory = new CachingConnectionFactory();
        connFactory.setAddresses(host);
        connFactory.setPort(port);
        connFactory.setUsername(username);
        connFactory.setPassword(password);
        connFactory.setVirtualHost(vHost);
        // 手动应答
        connFactory.setPublisherConfirms(true);
        return connFactory;
    }

    @Bean("baseRabbitManualAdmin")
    public RabbitAdmin baseRabbitManualAdmin(
            @Qualifier("baseRabbitManualConnFactory") ConnectionFactory connFactory
    ){
        RabbitAdmin rabbitAdmin = new RabbitAdmin(connFactory);
        return rabbitAdmin;
    }

    @Bean("baseRabbitManualTemplate")
    public RabbitTemplate baseRabbitManualTemplate(
            @Qualifier("baseRabbitManualConnFactory") ConnectionFactory connFactory
    ){
        RabbitTemplate rabbitTemplate = new RabbitTemplate(connFactory);
        // 设置消息转换Json格式传输
        rabbitTemplate.setMessageConverter(new Jackson2JsonMessageConverter());
      return rabbitTemplate;
    }

    @Bean("baseManualRabbitListenerContainerFactory")
    public SimpleRabbitListenerContainerFactory baseManualRabbitListenerContainerFactory(
            SimpleRabbitListenerContainerFactoryConfigurer configurer,
            @Qualifier("baseRabbitManualConnFactory") ConnectionFactory connFactory
    ){
        SimpleRabbitListenerContainerFactory factory = new SimpleRabbitListenerContainerFactory();
        // 设置消费者个数
        factory.setConcurrentConsumers(1);
        // 设置每次消费个数
        factory.setPrefetchCount(2);
        factory.setAcknowledgeMode(AcknowledgeMode.MANUAL);
//        rabbitListenerContainerFactory.setTaskExecutor(taskExecutor);
        configurer.configure(factory, connFactory);
        return factory;
    }

}
