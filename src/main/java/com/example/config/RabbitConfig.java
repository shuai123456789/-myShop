package com.example.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.FanoutExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.config.SimpleRabbitListenerContainerFactory;
import org.springframework.amqp.rabbit.connection.CachingConnectionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitConfig {

    @Bean
    SimpleRabbitListenerContainerFactory consumerBatchContainerFactory() {
        SimpleRabbitListenerContainerFactory factory = new SimpleRabbitListenerContainerFactory();
        factory.setConnectionFactory(cachingConnectionFactory());
        factory.setBatchListener(true);
        //每次接两条
        factory.setBatchSize(20);
        //十秒内没有数据再入队列，也执行
        factory.setReceiveTimeout(1000L * 10);
        factory.setConsumerBatchEnabled(true);
        return factory;
    }
    @Bean
    CachingConnectionFactory cachingConnectionFactory() {
        CachingConnectionFactory factory = new CachingConnectionFactory();
        factory.setHost("172.21.6.227");
        factory.setPort(5672);
        factory.setUsername("root");
        factory.setPassword("hntl@1606");
        factory.setVirtualHost("host1");
        factory.setRequestedHeartBeat(30);
        return factory;
    }
}
