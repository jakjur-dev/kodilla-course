package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.math.BigDecimal;

@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    private InvoiceDao invoiceDao;
    private ItemDao itemDao;

    @Test
    void testInvoiceDaoSave() {

        //given
        Invoice invoice = new Invoice("IV101");

        Item item1 = new Item(new BigDecimal(1), 1, new BigDecimal(1));
        Item item2 = new Item(new BigDecimal(2), 2, new BigDecimal(2));
        Item item3 = new Item(new BigDecimal(3), 3, new BigDecimal(3));

        invoice.getItems().add(item1);
        invoice.getItems().add(item2);
        invoice.getItems().add(item3);

        item1.setInvoice(invoice);
        item2.setInvoice(invoice);
        item3.setInvoice(invoice);

        //when
        invoiceDao.save(invoice);
        int id = invoice.getId();

        //then
        assertNotEquals(0, id);

        //cleanup
        invoiceDao.deleteById(id);
    }
}
