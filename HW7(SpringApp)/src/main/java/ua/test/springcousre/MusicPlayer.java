package ua.test.springcousre;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@EqualsAndHashCode
@NoArgsConstructor
@Setter
public class MusicPlayer {
    private List<Music> musicList = new ArrayList<Music>();
    private String name;
    private int volume;

    public void playMusic(){
        for (Music music: musicList){
            System.out.println("Playing: " + music.getSong());
        }
    }
}
