package com.targetready.bankService.consumer;

import com.targetready.bankService.service.InvoiceService;
import com.targetready.orderService.model.Invoice;
import com.targetready.orderService.model.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import com.targetready.bankService.producer.BankProducer;
@Service
public class BankConsumer {

   private  Invoice invoice;
    @Autowired
    private  BankProducer bankProducer;
    private final InvoiceService invoiceService;

    public BankConsumer( InvoiceService invoiceService) {
        this.invoiceService = invoiceService;
    }


    @KafkaListener(topics = "payments", groupId = "payment-group")
    public void consume(Payment payment) {

        invoice = new Invoice();
        invoice.setOrderId(payment.getOrderId());
        invoice.setAmount(payment.getAmount());
        invoice.setTransactionId(payment.getTransactionId());
        invoice.setStatus(true);
        invoice.setBank(payment.getBank());


        invoiceService.saveInvoice(invoice);

        System.out.println("Invoice saved: " + invoice);

        bankProducer.sendInvoice(invoice);


    }

}
