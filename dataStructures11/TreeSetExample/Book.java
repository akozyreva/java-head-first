package dataStructures11.TreeSetExample;

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
}
