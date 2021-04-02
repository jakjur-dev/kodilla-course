package com.kodilla.good.patterns.challenges.food2door;

public class GlutenFreeShop implements Supplier {

    @Override
    public DeliveryDTO process(final DeliveryRequest orderDeliveryRequest) {

        if (orderDeliveryRequest.getProduct().getProductQuantity() >= orderDeliveryRequest.getAmount()) {
            orderDeliveryRequest.getProduct().sendProduct(orderDeliveryRequest.getAmount());
            System.out.println("Sending " + orderDeliveryRequest.getProduct().getProductName() + " in amount of " + orderDeliveryRequest.getAmount()
                    + " from Gluten Free Shop");
            return new DeliveryDTO("Extra Food Shop", orderDeliveryRequest.getProduct(), orderDeliveryRequest.getAmount(), true);
        } else {
            System.out.println("The product is out of stock, please enter amount lower than " + orderDeliveryRequest.getProduct().getProductQuantity());
            return new DeliveryDTO("Extra Food Shop", orderDeliveryRequest.getProduct(), orderDeliveryRequest.getAmount(), false);
        }
    }
}
