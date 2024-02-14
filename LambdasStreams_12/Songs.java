package LambdasStreams_12;

import java.util.List;
import java.util.stream.Collectors;

public class Songs {
    public static void main(String[] args) {
        Songs songs = new Songs();
        List<Song> songsList = songs.getSongs();
        //songsList.forEach(song -> System.out.println(song));
        songsList.stream().
                filter(song -> song.getGenre().toLowerCase().contains("rock")).
                forEach(System.out::println);
        System.out.println("Found Beatles songs");
        songsList.stream().
                filter(song -> song.getArtist().equals("The Beatles")).
                forEach(System.out::println);
        System.out.println("Songs start with H");
        songsList.stream().
                filter(song -> song.getTitle().startsWith("H")).
                forEach(System.out::println);
        System.out.println("Year > 1995");
        songsList.stream().
                filter(song -> song.getYear() > 1995).
                forEach(System.out::println);
        System.out.println("List of all genres");
        songsList.stream().map(song -> song.getGenre())
                .distinct()
                .forEach(System.out::println);
    }
    public List<Song> getSongs(){
        return List.of(
        new Song("$10", "Hitchhiker", "Electronic", 2016, 183),
        new Song("Havana", "Camila Cabello", "R&B", 2017, 324),
        new Song("Cassidy", "Grateful dead", "Rock", 1972, 123),
        new Song("50 ways", "Paul Simon", "Soft Rock", 1975, 1999),
                new Song("50 ways", "Paul Simon", "Soft Rock", 1975, 1999),
                new Song("With a little help From My Friends", "The Beatles", "Blues rock", 1968, 168)
        );
    }
}
