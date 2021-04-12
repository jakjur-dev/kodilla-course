package com.kodilla.good.patterns.challenges.food2door;

public class HealthyShop implements Supplier {

    @Override
    public DeliveryDTO process(final DeliveryRequest orderDeliveryRequest) {
        if (orderDeliveryRequest.getProduct().getProductQuantity() >= orderDeliveryRequest.getAmount()) {
            System.out.println("Sending " + orderDeliveryRequest.getProduct().getProductName() + " in amount of " + orderDeliveryRequest.getAmount()
                    + " from Healthy Shop");
            return new DeliveryDTO("Extra Food Shop", orderDeliveryRequest.getProduct(), orderDeliveryRequest.getAmount(), true);
        } else {
            int productsToOutsource = orderDeliveryRequest.getAmount() - orderDeliveryRequest.getProduct().getProductQuantity();
            orderDeliveryRequest.getProduct().sendProduct(orderDeliveryRequest.getProduct().getProductQuantity());
            System.out.println("The product is out of stock, the remaining "
                    + productsToOutsource + " items will be from outsourced suppliers");
            return new DeliveryDTO("Extra Food Shop", orderDeliveryRequest.getProduct(), orderDeliveryRequest.getProduct().getProductQuantity(), true);
        }
    }
}
