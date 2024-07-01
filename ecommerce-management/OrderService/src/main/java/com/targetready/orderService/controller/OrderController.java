package com.targetready.orderService.controller;


import com.targetready.orderService.model.Order;
import com.targetready.orderService.service.KafkaProducerService;
import com.targetready.orderService.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/target")
public class OrderController {

    @Autowired
    private KafkaProducerService kafkaProducerService;

    @Autowired
    private UserService userService;

    @PostMapping("/orders")
    public ResponseEntity<String> createOrder(@RequestBody Order order) {
        kafkaProducerService.sendOrder(order);
        return ResponseEntity.ok("Order sent to Kafka topic");
    }

    @GetMapping("/all-orders")
    public List<Order> getUser() {
        System.out.println("Getting Orders");
        return this.userService.getOrders();
    }
}

