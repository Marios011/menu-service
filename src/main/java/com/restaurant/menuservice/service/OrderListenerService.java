package com.restaurant.menuservice.service;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class OrderListenerService {

    @RabbitListener(queues = "order_queue")
    public void handleOrder(Object order){

        System.out.println(order);
    }
}
