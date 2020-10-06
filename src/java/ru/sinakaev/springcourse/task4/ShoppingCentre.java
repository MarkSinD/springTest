package ru.sinakaev.springcourse.task4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ShoppingCentre {

    @Value("${shopCenter.name}")
    String name;

    @Value("${shopCenter.stars}")
    int countStars;

    Seller seller;

    @Autowired
    ShoppingCentre(@Qualifier("builderShop") Seller seller){
        this.seller = seller;
    }

    void getService(){
        seller.sell();
    }

    void getCharacter(){
        System.out.println("Name = " + name + "\nStars = " + countStars);
    }
}
