package com.kodilla.good.patterns.challenges.food2door;

public class RequestRetriever {

    public DeliveryRequest retrieveRequest(){
        Product product = new Product("bread", 13);
        int amountToSend = 80;

        return  new DeliveryRequest(product, amountToSend);
    }

    public Supplier retrieveSupplier(){
        return new HealthyShop();
    }
}
