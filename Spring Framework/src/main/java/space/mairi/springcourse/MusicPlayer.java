package space.mairi.springcourse;

public class MusicPlayer {
    private static Music music;

    // IoC
    public MusicPlayer(Music music){
        this.music = music;
    }

    public static void PlayMusic(){
        System.out.println("Playing: " + music.getSong());
    }
}
