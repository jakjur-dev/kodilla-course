package com.kodilla.good.patterns.challenges.service;

public class Product {

    public String productName;
    public int productQuantity;

    public Product(String productName, int productQuantity) {
        this.productName = productName;
        this.productQuantity = productQuantity;
    }

    public String getProductName() {
        return productName;
    }

    public int getProductQuantity() {
        return productQuantity;
    }

    public void sendProduct() {
        productQuantity--;
    }
}
