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
    @Column(name = "order_id")
    private String orderId;

    @Column(name = "amount")
    private double amount;

    @Column(name = "transaction_id")
    private String transactionId;

    @Column(name = "status")
    private Boolean status;

    @Column(name = "bank")
    private String bank;
}
