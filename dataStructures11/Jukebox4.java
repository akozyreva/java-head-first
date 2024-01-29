package dataStructures11;

import java.util.Collections;
import java.util.List;

// example with Comparator
public class Jukebox4 {
    public static void main(String[] args) {
        new Jukebox4().go();
    }

    public void go(){
        List<SongV3> songList = MockSongs.getSongsV3();
        Collections.sort(songList);
        System.out.println(songList);

        ArtistCompare artistCompare = new ArtistCompare();
        songList.sort(artistCompare); // and we pass Comparator here
        System.out.println(songList);

        // or we can simply sort, using lambda
        songList.sort( (one, two) -> one.getTitle().compareTo(two.getTitle()));
        System.out.println(songList);

    }
}


