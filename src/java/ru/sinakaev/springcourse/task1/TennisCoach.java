package ru.sinakaev.springcourse.task1;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
    FortuneService fortuneService;

    /*@Autowired
    TennisCoach(@Qualifier("sadFortuneService") FortuneService fortuneService){
        this.fortuneService = fortuneService;
    }*/

    TennisCoach(){

    }

    @Override
    public String getDalyEx() {
        return "Играй в тенис каждый день по 2 часа";
    }

    @Autowired
    void setFortuneService(@Qualifier("sadFortuneService") FortuneService fortuneService){
        this.fortuneService = fortuneService;
    }

    @Override
    public String getForturneToday(){
        return fortuneService.getFortune();
    }
}
