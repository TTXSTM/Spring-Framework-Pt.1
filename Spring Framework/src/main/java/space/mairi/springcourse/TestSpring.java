package space.mairi.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.naming.Context;

public class TestSpring {
    // (en) Referencing a configuration file
    // (ru) Обрашение к конфигурационному файлу
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
            // (en) Getting Bean
            // (ru) Получаем Bean

        //Music music = context.getBean("MusicBean", Music.class);
        //MusicPlayer musicPlayer = new MusicPlayer(music);

        MusicPlayer musicPlayer = context.getBean("MusicPlayer", MusicPlayer.class);
        MusicPlayer.PlayMusic();

        context.close();
    }
}
