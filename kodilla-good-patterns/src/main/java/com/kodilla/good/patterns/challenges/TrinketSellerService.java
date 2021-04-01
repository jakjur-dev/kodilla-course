package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class TrinketSellerService implements OrderService {

    @Override
    public boolean order(User user, Product product, String address) {
        System.out.println("Sending order \"" + product.getProductName() + "\" to: \n" + user.getFirstName() + " " + user.getSurname()
                +", " + address);
        return true;
    }
}
