package com.kodilla.good.patterns.challenges;

public class ProductOrderService {
    private InformationService informationService;
    private OrderService orderService;
    private OrderRepository orderRepository;

    public ProductOrderService(InformationService informationService, OrderService orderService, OrderRepository orderRepository) {
        this.informationService = informationService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }

    public OrderDto process(final OrderRequest orderRequest){
        boolean isOrderPlaced = orderService.newOrder(
                orderRequest.getSeller(),
                orderRequest.getCustomer(),
                orderRequest.getBasket()
        );

        if(isOrderPlaced){
            informationService.informSeller(orderRequest.getSeller());
            informationService.informCustomer(orderRequest.getCustomer());
            orderRepository.createOrder(orderRequest);
            return new OrderDto(orderRequest,true);
        }else{
            return new OrderDto(orderRequest,false);
        }
    }
    public static void main(String[] args){
        ProductOrderService buyNowService = new ProductOrderService(new EmailInformationService(),new BuyNowService(),new OrderConsoleCollector());
        buyNowService.process(new BuyNowRequest(
                new BusinessUser("Kodilla"),
                new BusinessUser("Nie-kodilla"),
                new StandardBasket("Bootcamp Java Developer")
        ));
    }
}
