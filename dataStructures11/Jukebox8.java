package dataStructures11;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Jukebox8 {

    public static void main(String[] args) {
        new Jukebox8().go();
    }
    public void go(){
        // In SongV4 we declare, how Set should understand,
        // that 2 objects are duplicates by rewriting methods
        // equals and hashCode
        List<SongV4> songList = MockSongs.getSongsV4();
        System.out.println(songList);
        songList.sort((one, two) -> one.getTitle().compareTo(two.getTitle()));
        System.out.println(songList);

        Set<SongV4> songV3Set = new HashSet<>(songList);
        System.out.println(songV3Set);


    }
}
