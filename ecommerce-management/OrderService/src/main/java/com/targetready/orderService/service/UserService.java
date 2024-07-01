package com.targetready.orderService.service;

import com.targetready.orderService.model.Order;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {
    private List<Order> store = new ArrayList<>();

    public UserService() {
        store.add(new Order(UUID.randomUUID().toString(), 10.0, "ICIC","XXYY11", 10L));
        store.add(new Order(UUID.randomUUID().toString(), 10.0, "SBI","XXYY11", 10L));
    }

    public List<Order> getOrders(){
        return this.store;
    }
}
