package com.kodilla.good.patterns.challenges;

public interface OrderService {

    default boolean order(User user, Product product, String address){
        return true;
    }
}
