package com.kodilla.good.patterns.challenges.food2door;

public class DeliveryProcessor {
    private Supplier supplier;
    public DeliveryRequest deliveryRequest;

    public DeliveryProcessor(Supplier supplier, DeliveryRequest deliveryRequest) {
        this.supplier = supplier;
        this.deliveryRequest = deliveryRequest;
    }

    public void process() {
        supplier.process(deliveryRequest);
    }
}
