package dataStructures11.TreeSetExample;

import dataStructures11.SongV4;

public class Book implements Comparable<Book>{
    private String title;
    public Book(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public int compareTo(Book book) {
        return this.title.compareTo(book.getTitle());
    }

    @Override
    public String toString() {
        return title;
    }

    public int hashCode(){
        return title.hashCode(); // hashCode of title, because if title is the same, it's duplicate
    }

    public boolean equals(Object aBook){
        Book other = (Book) aBook;
        return title.equals(other.getTitle());
    }
}
