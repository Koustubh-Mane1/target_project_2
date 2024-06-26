package com.targetready.orderService.mapper;

import com.targetready.orderService.dto.InvoiceDTO;
import com.targetready.orderService.model.Invoice;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface InvoiceMapper {
    InvoiceDTO toDto(Invoice invoice);
    Invoice toEntity(InvoiceDTO invoiceDTO);
}


