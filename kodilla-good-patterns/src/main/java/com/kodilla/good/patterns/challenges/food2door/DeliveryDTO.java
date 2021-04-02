package com.kodilla.good.patterns.challenges.food2door;

public class DeliveryDTO {
    public String supplierName;
    public Product product;
    boolean isSent;
    int amount;

    public DeliveryDTO(String supplierName, Product product, int amount, boolean isSent) {
        this.supplierName = supplierName;
        this.product = product;
        this.isSent = isSent;
        this.amount = amount;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public Product getProduct() {
        return product;
    }

    public boolean isSent() {
        return isSent;
    }

    public int getAmount() {
        return amount;
    }
}
