package com.kodilla.good.patterns.challenges;

public class TrinketSellerRepository implements OrderRepository {
    @Override
    public void createRental(Product product) {
        product.sendProduct();
        System.out.println("There are " + product.getProductQuantity() + " " + product.getProductName() + " left in the stock");
    }
}
