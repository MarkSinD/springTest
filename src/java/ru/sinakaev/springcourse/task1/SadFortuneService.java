package ru.sinakaev.springcourse.task1;

import org.springframework.stereotype.Component;

@Component
public class SadFortuneService implements FortuneService {
    @Override
    public String getFortune() {
        return "Unfortunately today is not your day";
    }
}
