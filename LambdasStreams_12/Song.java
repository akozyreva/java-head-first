package LambdasStreams_12;

public class Song {

    private final String title;
    private final String artist;
    private final String genre;
    private final int year;
    private final int timesPlayed;
    public Song(String title, String artist, String genre, int year, int timePlayed) {
        this.title = title;
        this.artist = artist;
        this.genre = genre;
        this.year = year;
        this.timesPlayed = timePlayed;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public int getTimesPlayed() {
        return timesPlayed;
    }

    public int getYear() {
        return year;
    }

    public String getGenre() {
        return genre;
    }

    @Override
    public String toString(){
        return title + " " + artist;
    }
}
