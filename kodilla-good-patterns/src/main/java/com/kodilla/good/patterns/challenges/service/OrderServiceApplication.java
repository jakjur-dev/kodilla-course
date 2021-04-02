package com.kodilla.good.patterns.challenges.service;

public class OrderServiceApplication {

    public static void main(String[] args) {
        RequestRetriever rentRequestRetriever = new RequestRetriever();
        OrderRequest orderRequest = rentRequestRetriever.retrieve();

        ProductOrderService orderProcessor = new ProductOrderService(
                new MessageService(), new TrinketSellerService(), new TrinketSellerRepository());
        orderProcessor.process(orderRequest);
    }
}
