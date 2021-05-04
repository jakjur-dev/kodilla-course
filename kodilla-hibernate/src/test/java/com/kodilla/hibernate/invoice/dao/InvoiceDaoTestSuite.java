package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;
import java.util.List;

@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    private InvoiceDao invoiceDao;
    @Autowired
    private ItemDao itemDao;
    @Autowired
    private ProductDao productDao;

    @Test
    void testInvoiceDaoSave() {

        //given
        Invoice invoice = new Invoice("IV101");

        Item item1 = new Item(new BigDecimal(1), 1, new BigDecimal(1));
        Item item2 = new Item(new BigDecimal(2), 2, new BigDecimal(2));
        Item item3 = new Item(new BigDecimal(3), 3, new BigDecimal(3));

        Product product = new Product("product");
        productDao.save(product);

        invoice.getItems().add(item1);
        invoice.getItems().add(item2);
        invoice.getItems().add(item3);

        product.getItems().add(item1);
        product.getItems().add(item2);
        product.getItems().add(item3);

        item1.setInvoice(invoice);
        item2.setInvoice(invoice);
        item3.setInvoice(invoice);

        item1.setProduct(product);
        item2.setProduct(product);
        item3.setProduct(product);

        //when
        invoiceDao.save(invoice);
        int invoice_id = invoice.getId();
        List<Item> itemsByproductList = itemDao.findByProduct(product);
        List<Item> itemsByInvoiceList = itemDao.findByInvoice(invoice);

        //then
        assertNotEquals(0, invoice_id);
        assertEquals(3,itemsByproductList.size());
        assertEquals(3,itemsByInvoiceList.size());

        //cleanup
        invoiceDao.deleteById(invoice_id);
    }
}
