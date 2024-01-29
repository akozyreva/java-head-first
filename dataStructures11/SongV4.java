package dataStructures11;

public class SongV4 implements Comparable<SongV4> {
    private String title;
    private String artist;
    private int bpm;

    public SongV4(String title, String artist, int bpm) {
        this.title = title;
        this.artist = artist;
        this.bpm = bpm;
    }

    public boolean equals(Object aSong){
        SongV4 other = (SongV4) aSong;
        return title.equals(other.getTitle());
    }

    public int hashCode(){
        return title.hashCode(); // hashCode of title, because if title is the same, it's duplicate
    }

    public String getTitle() {
        return title;
    }

    public int getBpm() {
        return bpm;
    }

    public String getArtist() {
        return artist;
    }

    @Override
    public String toString(){
        return title;
    }

    @Override
    public int compareTo(SongV4 song) {
        return this.title.compareTo(song.getTitle());
    }

}
