package com.kodilla.good.patterns.challenges.food2door;

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

    public void sendProduct(int sentQuantity) {
        productQuantity -= sentQuantity;
    }
}
