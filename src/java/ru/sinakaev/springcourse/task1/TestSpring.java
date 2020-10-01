package ru.sinakaev.springcourse.task1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        TennisCoach tennisCoach = (TennisCoach) context.getBean("tennisCoach");

        System.out.println(tennisCoach.getForturneToday());
        System.out.println(tennisCoach.getDalyEx());
    }
}
