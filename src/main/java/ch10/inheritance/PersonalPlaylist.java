package ch10.inheritance;

public class PersonalPlaylist extends Playlist{
    public void remove(Song song){
        getTracks().remove(song);
    }
}
