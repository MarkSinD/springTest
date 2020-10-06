package ru.sinakaev.springcourse.task4;

import org.springframework.stereotype.Component;

@Component
public class BuilderShop implements Seller {
    @Override
    public void sell() {
        System.out.println("Buy builder things");
    }
}
