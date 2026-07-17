package com.restaurant.menuservice.service;

import org.springframework.stereotype.Service;

@Service
public class MenuUpdateService {
    public void processTableUpdate(Long tablesId){
        System.out.println("Processing business logic for table: " + tablesId);
    }
}
