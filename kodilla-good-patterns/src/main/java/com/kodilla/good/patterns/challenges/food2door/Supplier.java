package com.kodilla.good.patterns.challenges.food2door;

public interface Supplier {
    default DeliveryDTO process(DeliveryRequest orderDeliveryRequest) {
        return null;
    }
}
