package ru.sinakaev.springcourse.task2;

import org.springframework.beans.factory.annotation.Value;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    private Music music;
    private List<Music> musicList;

    @Value("${musicPlayer.name}")
    private String manufacturer;

    @Value("${musicPlayer.volume}")
    private int volume;

    MusicPlayer(List<Music> musicList ){
        this.musicList = musicList;
    }

    public String getMusic(){
        return musicList.toString();
    }

    public String getSpecifications(){
        return "Manufacturer : " + manufacturer + "\nVolume : " + volume;
    }


}
