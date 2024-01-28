package ch10.inheritance;

import lombok.Getter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Getter
public class Playlist {
    private List<Song> tracks = new ArrayList<>();
    private Map<String,String> singers = new HashMap<>();

    public void append(Song song){
       getTracks().add(song);
       singers.put(song.getSinger(),song.getTitle());
    }

}
