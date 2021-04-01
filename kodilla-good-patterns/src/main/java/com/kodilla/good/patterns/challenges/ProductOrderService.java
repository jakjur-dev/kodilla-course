package com.kodilla.good.patterns.challenges;

public class ProductOrderService {
    private InformationService informationService;
    private OrderService orderService;
    private OrderRepository orderRepository;

    public ProductOrderService(final InformationService informationService,
                           final OrderService orderService,
                           final OrderRepository orderRepository) {
        this.informationService = informationService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }

    public OrderDto process(final OrderRequest orderRequest) {
        boolean isRented = orderService.order(orderRequest.getUser(), orderRequest.getProduct(), orderRequest.getAddress());

        if (isRented) {
            informationService.inform(orderRequest.getUser());
            orderRepository.createRental(orderRequest.getProduct());
            return new OrderDto(orderRequest.getUser(), orderRequest.getProduct(), true);
        } else {
            return new OrderDto(orderRequest.getUser(), orderRequest.getProduct(), false);
        }
    }
}
