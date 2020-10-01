package ru.sinakaev.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class MusicPlayer {
    private Music music;
    private String name;
    private String volume;
    private ArrayList<Music> musicList;


    public void doInit(){
        System.out.println("Init");
    }

    public void doDestroy(){
        System.out.println("Destroy");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    MusicPlayer(ArrayList musicList){
        this.musicList = musicList;
    }

    MusicPlayer(){ }

    String getMusic(){
        return musicList.toString();
    }

    public void setMusic(Music music){
        this.music = music;
    }
}
