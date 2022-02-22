package com.kodilla.good.patterns.challenges;

public class EmailInformationService implements InformationService {
    @Override
    public void informSeller(ServiceUser serviceUser){
        System.out.println("Sold!");
    }
    @Override
    public void informCustomer(ServiceUser serviceUser){
        System.out.println("Bought!");
    }
}
