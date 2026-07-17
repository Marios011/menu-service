package com.restaurant.menuservice.config;


import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class RabbitMQConfig {

    @Bean
    public Queue tableStatusQueue() {
        return new Queue("table-status-queue", true);
    }
}
