package space.mairi.springcourse;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    private static List<Music> musicList = new ArrayList<>();
    public List<Music> getMusicList() {
        return musicList;
    }

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    private String name;
    private int volume;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    // IoC
    public MusicPlayer(List<Music> musicList){
        this.musicList = musicList;
    }

    public MusicPlayer(){}

    public static void PlayMusic(){
        for(int i = 0; i < 4; i++){
            System.out.println("Playing: " + musicList.get(i).getSong());
        }
    }
}
