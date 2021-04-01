package com.kodilla.good.patterns.challenges;

public class OrderDto {
    public User user;
    public Product product;
    public boolean isSent;

    public OrderDto(final User user, final Product product, final boolean isSent) {
        this.user = user;
        this.isSent = isSent;
    }

    public User getUser() { return user; }

    public Product getProduct() {
        return product;
    }

    public boolean isSent() { return isSent; }
}
