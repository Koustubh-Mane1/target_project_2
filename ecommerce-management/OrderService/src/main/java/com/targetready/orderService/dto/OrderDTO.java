package com.targetready.orderService.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderDTO {
    private String orderId;
    private double amount;
    private String bank;
    private String productId;
    private Long quantity;
}

