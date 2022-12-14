package space.mairi.springcourse;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    private static List<Music> musicList = new ArrayList<>();
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

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }


    public static void PlayMusicList(){
        for(Music music : musicList){
            System.out.println("Playing: " + music.getSong());

        }
    }
}
