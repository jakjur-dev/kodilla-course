package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class OrderRequest {
    private User user;
    private Product product;
    private String address;

    public OrderRequest(final User user, final Product product, final String address) {
        this.user = user;
        this.product = product;
        this.address = address;
    }

    public User getUser() { return user; }

    public Product getProduct() {
        return product;
    }

    public String getAddress() {
        return address;
    }
}
