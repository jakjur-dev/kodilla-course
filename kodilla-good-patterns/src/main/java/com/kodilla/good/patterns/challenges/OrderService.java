package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public interface OrderService {

    default boolean order(User user, Product product, String address){
        return true;
    }
}
