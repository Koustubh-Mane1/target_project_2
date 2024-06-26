package com.targetready.orderService.mapper;

import com.targetready.orderService.dto.PaymentDTO;
import com.targetready.orderService.model.Payment;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PaymentMapper {
    PaymentDTO toDto(Payment payment);
    Payment toEntity(PaymentDTO paymentDTO);
}

