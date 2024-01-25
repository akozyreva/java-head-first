package dataStructures11;

import java.util.Collections;
import java.util.List;

public class Jukebox1 {
    public static void main(String[] args) {
        new Jukebox1().go();
    }

    private void go() {
        List<String> songList = MockSongs.getSongStrings();
        System.out.println(songList);
        Collections.sort(songList); // sort song titles using "natural ordering"
        System.out.println(songList);
    }
}
