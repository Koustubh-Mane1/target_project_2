package com.targetready.orderService.service;

import com.targetready.orderService.repository.InvoiceRepository;
import com.targetready.orderService.model.Invoice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    private final InvoiceRepository invoiceRepository;

    @Autowired
    public OrderService(InvoiceRepository invoiceRepository){

        this.invoiceRepository = invoiceRepository;
    }

    public void saveInvoice(Invoice invoice) {
        invoiceRepository.save(invoice);
    }
}
