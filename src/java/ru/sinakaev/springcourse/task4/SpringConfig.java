package ru.sinakaev.springcourse.task4;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
// @ComponentScan("ru.sinakaev.springcourse.task4")
@PropertySource("classpath:shopCenter.properties")
public class SpringConfig {

    @Bean
    public Seller petShop(){
        return new PetShop();
    }

    @Bean
    public ShoppingCentre shoppingCentre(){
        return new ShoppingCentre(petShop());
    }
}
