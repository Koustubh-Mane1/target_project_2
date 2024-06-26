package com.targetready.orderService.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "orders")
public class Invoice {
    @Id
    private String orderId;

    private double amount;

    private String transactionId;

    private Boolean status;

    private String bank;

    private String productId;

    private Long  quantity;


}
