package dataStructures11.TreeSetExample;

import java.util.Set;
import java.util.TreeSet;

// example with using comparator for Book objs
public class TestTreeComparator {
    public static void main(String[] args) {
        new TestTreeComparator().go();
    }
    private void go() {
        Book b1 = new Book("How Cats Work");
        Book b2 = new Book("Remix Your Body");
        Book b3 = new Book("Finding Emo");

        BookCompare bookCompare = new BookCompare();
        // and we're passing comparator here
        Set<Book> tree = new TreeSet<>(bookCompare);
        tree.add(b1);
        tree.add(b2);
        tree.add(b3);
        // in order to see readable objects, you also need to rewrite toString
        System.out.println(tree);
    }
}
