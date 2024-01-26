package dataStructures11;

public class SongV2 implements Comparable<SongV2>{
    private String title;
    private String artist;
    private int bpm;

    public SongV2(String title, String artist, int bpm) {
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
    public int compareTo(SongV2 song) {
        System.out.println(this.title.compareTo(song.getTitle()));
        return this.title.compareTo(song.getTitle());
    }
}
