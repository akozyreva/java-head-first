package dataStructures11;

import java.util.HashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
        names.add("John");
        names.add("Ivan");
        names.add("Kate");
        names.add("Ivan"); // it will be removed
        // set doesn't have particular order
        // example how to remove item from set - by name
        names.remove("Kate");
        System.out.println(names);


    }
}
