
package com.targetready.orderService.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class InvoiceDTO {
    private String orderId;
    private double amount;
    private String transactionId;
    private Boolean status;
    private String bank;
    private String productId;
    private Long quantity;
}

