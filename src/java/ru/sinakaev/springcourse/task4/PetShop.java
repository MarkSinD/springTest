package ru.sinakaev.springcourse.task4;


import org.springframework.stereotype.Component;

@Component
public class PetShop implements Seller {
    @Override
    public void sell() {
        System.out.println("Buy pet things");
    }
}
