package com.kodilla.good.patterns.challenges.food2door;

public class ExtraFoodShop implements Supplier{

    @Override
    public DeliveryDTO process(final DeliveryRequest orderDeliveryRequest) {

        if (orderDeliveryRequest.getProduct().getProductQuantity() >= orderDeliveryRequest.getAmount()) {
            orderDeliveryRequest.getProduct().sendProduct(orderDeliveryRequest.getAmount());
            System.out.println("Sending " + orderDeliveryRequest.getProduct().getProductName() + " in amount of " + orderDeliveryRequest.getAmount()
                    + " from Extra Food Shop");
            return new DeliveryDTO("Extra Food Shop", orderDeliveryRequest.getProduct(), orderDeliveryRequest.getAmount(), true);
        } else {
            orderDeliveryRequest.getProduct().sendProduct(orderDeliveryRequest.getAmount());
            System.out.println("The product is out of stock, the remaining "
                    + (-orderDeliveryRequest.getProduct().getProductQuantity()) + " items will be sent in later days");
            return new DeliveryDTO("Extra Food Shop", orderDeliveryRequest.getProduct(), orderDeliveryRequest.getAmount(), false);
        }
    }

}