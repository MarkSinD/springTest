package ru.sinakaev.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        MusicPlayer musicPlayer = (MusicPlayer) context.getBean("musicPlayer");

        System.out.println(musicPlayer.getMusic());

        context.close();

    }

}
