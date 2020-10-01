package ru.sinakaev.springcourse.task2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext configApplicationContext =
                new AnnotationConfigApplicationContext(SpringConfig.class);

        MusicPlayer musicPlayer = configApplicationContext.getBean("musicPlayerBean", MusicPlayer.class);

        System.out.println(musicPlayer.getMusic());
        System.out.println(musicPlayer.getSpecifications());
    }
}
