package com.kodilla.good.patterns.challenges.service;

public class RequestRetriever {

    public OrderRequest retrieve() {
        User user = new User("John", "Wekl", 123456789);
        Product product = new Product("toothbrush", 80);
        String address = "Stanisława Wyspiańskiego 26A/1, 60-751 Poznań";

        return new OrderRequest(user, product, address);
    }

}
