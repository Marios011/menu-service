package com.restaurant.menuservice.Listener;


import com.restaurant.menuservice.service.MenuUpdateService;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class TableStatusListener {

    private final MenuUpdateService menuUpdateService;

    public TableStatusListener(MenuUpdateService menuUpdateService) {
        this.menuUpdateService = menuUpdateService;
    }

    @RabbitListener(queues = "table-status-queue")
    public void receiveMessages(String message) {
        String[] parts = message.split(" ");
        Long tableId = Long.parseLong(parts[1]);

        menuUpdateService.processTableUpdate(tableId);
    }
}
