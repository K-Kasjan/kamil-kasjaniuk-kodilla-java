package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.transaction.Transactional;
import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

@SpringBootTest
@Transactional
public class InvoiceDaoTestSuite {

    @Autowired
    private InvoiceDao invoiceDao;

    @Test
    void testInvoiceDaoSave(){
        //Given
        Product product1 = new Product("Test 1");
        Product product2 = new Product("Test 2");
        Product product3 = new Product("Test 3");

        Item item1 = new Item(product1, new BigDecimal(10),3);
        Item item2 = new Item(product1, new BigDecimal(12),7);
        Item item3 = new Item(product2, new BigDecimal(30),2);
        Item item4 = new Item(product2, new BigDecimal(35),6);
        Item item5 = new Item(product3, new BigDecimal(50),2);

        Invoice invoice = new Invoice("1/03/2022");

        invoice.getItems().add(item1);
        invoice.getItems().add(item2);
        invoice.getItems().add(item3);
        invoice.getItems().add(item4);
        invoice.getItems().add(item5);

        //When
        invoiceDao.save(invoice);
        int invoiceId = invoice.getId();

        //Then
        assertNotEquals(0,invoiceId);
    }

    @Test
    void testItemValue(){
        //Given
        Product product1 = new Product("Test 1");

        Item item1 = new Item(product1, new BigDecimal(10),3);

        Invoice invoice = new Invoice("1/03/2022");
        invoice.getItems().add(item1);

        //When
        invoiceDao.save(invoice);
        BigDecimal loadedInvoiceValue = invoiceDao.findById(invoice.getId()).get().getItems().get(0).getValue();

        //Then
        assertEquals(30,loadedInvoiceValue);
    }
}
