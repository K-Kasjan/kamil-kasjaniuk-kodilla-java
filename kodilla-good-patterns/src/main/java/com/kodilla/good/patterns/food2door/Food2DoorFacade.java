package com.kodilla.good.patterns.food2door;

public class Food2DoorFacade {
    private final SupplierService extraFoodShopService;
    private final SupplierService healthyShopService;
    private final SupplierService glutenFreeShopService;

    public Food2DoorFacade(SupplierService extraFoodShopService, SupplierService healthyShopService, SupplierService glutenFreeShopService) {
        this.extraFoodShopService = extraFoodShopService;
        this.healthyShopService = healthyShopService;
        this.glutenFreeShopService = glutenFreeShopService;
    }

    public SupplierService getExtraFoodShopService() {
        return extraFoodShopService;
    }

    public SupplierService getHealthyShopService() {
        return healthyShopService;
    }

    public SupplierService getGlutenFreeShopService() {
        return glutenFreeShopService;
    }

    public void placeOrder(Order order, SupplierService supplierService){
        supplierService.process(order);
    }

}
