package ru.sinakaev.springcourse.task4;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        ShoppingCentre shoppingCentre = context.getBean("shoppingCentre", ShoppingCentre.class);
        shoppingCentre.getService();
        shoppingCentre.getCharacter();

    }
}
