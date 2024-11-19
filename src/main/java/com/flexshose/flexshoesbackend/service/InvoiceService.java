package com.flexshose.flexshoesbackend.service;

import com.flexshose.flexshoesbackend.dto.InvoiceDto;
import com.flexshose.flexshoesbackend.entity.Invoice;

import java.util.List;

public interface InvoiceService {
    InvoiceDto createInvoiceFormOrder(InvoiceDto invoiceDto);
    List<InvoiceDto> getAllInvoice();
    Invoice saveInvoice(Invoice invoice);
}