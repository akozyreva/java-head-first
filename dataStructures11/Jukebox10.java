package dataStructures11;

import com.sun.source.tree.Tree;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Jukebox10 {

    public static void main(String[] args) {
        new Jukebox10().go();
    }
    public void go(){
        // In SongV4 we declare, how Set should understand,
        // that 2 objects are duplicates by rewriting methods
        // equals and hashCode
        List<SongV4> songList = MockSongs.getSongsV4();
        System.out.println(songList);
        songList.sort((one, two) -> one.getTitle().compareTo(two.getTitle()));
        System.out.println(songList);

        // TreeSet - is set, which makes sort() by default
        // it can be used with Comparator as well
        Set<SongV4> songV4Set = new TreeSet<>(songList);
        System.out.println(songV4Set);

        // example of passing directly sorting
        Set<SongV4> songV4Set2 = new TreeSet<>((o1, o2) -> o1.getBpm() - o2.getBpm());
        songV4Set2.addAll(songList);
        System.out.println(songV4Set2);


    }
}
