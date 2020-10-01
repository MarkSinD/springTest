package ru.sinakaev.springcourse.task2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.ArrayList;
import java.util.List;

@Configuration
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {

    @Bean
    public RockMusic rockMusicBean(){
        return new RockMusic();
    }

    @Bean
    public PopMusic popMusicBean(){ return new PopMusic(); }

    @Bean
    public MusicPlayer musicPlayerBean(){
        List<Music> arrayList = new ArrayList();
        arrayList.add(rockMusicBean());
        arrayList.add(popMusicBean());
        return new MusicPlayer(arrayList);
    }
}
