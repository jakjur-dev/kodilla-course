package com.kodilla.good.patterns.challenges.food2door;


public class DeliveryRequest {
    private Product product;
    private int amount;

    public DeliveryRequest(Product product, int amount) {
        this.product = product;
        this.amount = amount;
    }

    public Product getProduct() {
        return product;
    }

    public int getAmount() {
        return amount;
    }
}
