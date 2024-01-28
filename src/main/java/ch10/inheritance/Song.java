package ch10.inheritance;

import lombok.Getter;

@Getter
public class Song {
    private String singer;
    private String title;

    public Song(String singer, String title) {
        this.singer = singer;
        this.title = title;
    }

}
