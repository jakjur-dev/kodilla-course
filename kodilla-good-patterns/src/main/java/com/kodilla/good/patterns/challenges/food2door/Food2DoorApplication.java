package com.kodilla.good.patterns.challenges.food2door;

public class Food2DoorApplication {

    public static void main(String[] args) {

        RequestRetriever requestRetriever = new RequestRetriever();
        DeliveryProcessor deliveryProcessor = new DeliveryProcessor(requestRetriever.retrieveSupplier(), requestRetriever.retrieveRequest());
        deliveryProcessor.process();

    }
}
