package dataStructures11;

public class SongV3 implements Comparable<SongV3> {
    private String title;
    private String artist;
    private int bpm;

    public SongV3(String title, String artist, int bpm) {
        this.title = title;
        this.artist = artist;
        this.bpm = bpm;
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
    public int compareTo(SongV3 song) {
        return this.title.compareTo(song.getTitle());
    }

}
