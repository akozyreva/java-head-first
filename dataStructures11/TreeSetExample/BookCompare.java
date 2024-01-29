package dataStructures11.TreeSetExample;

import java.util.Comparator;

public class BookCompare implements Comparator<Book> {
    public int compare(Book one, Book two) {
        return one.getTitle().compareTo(two.getTitle());
    }
}
