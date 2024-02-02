package dataStructures11;

import dataStructures11.TreeSetExample.Book;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class convenienceFactoryMethods {
    public static void main(String[] args) {
        // it creates immutable list
        List<String> strings = List.of("somersault", "cassidy", "$10", "123");
        System.out.println(strings);
        List<SongV4> songs = List.of(new SongV4("song1", "retro7", 147),
                new SongV4("song2", "greatful dead", 158));
        // the same with Sets - it removes duplicates on init
        // but then it will be immutable
        // in Book class were rewritten
        // hashCode and equals, so set understands, what is duplicate here
        // and now if I try to add duplicate it throws
        // IllegalArgumentException – if there are any duplicate elements
        Set<Book> books = Set.of(new Book("How Cats Work"),
                new Book("Finding Emo"));
                // new Book("How Cats Work") this will throw exception, that it's duplicate

        System.out.println(books);

        Map<String, Integer> stores = Map.of("Katy", 42,
                "Bert", 343,
                "Skyler", 420);
        System.out.println(stores);
    }
}
