package LambdasStreams_12;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LambdaExample {
    public static void main(String[] args) {
        List<String> allColors = List.of("Red", "Blu", "Yellow");
        for(String color: allColors){
            System.out.println(color);
        }
        allColors.forEach(color -> System.out.println(color));

        // List doesn't have implementation of stream. (for using stream api).
        // but Collections has a method to return stream for the Collection
        List<String> strings = List.of("I", "am", "a", "list", "of", "Strings");
        Stream<String> stream = strings.stream();

        // example of limit - limit list by 4
        Stream<String> limit = stream.limit(4);
        System.out.println(limit.toList()); // [I, am, a, list]
        // or in more extended way:
        // List<String> result = limit.collect(Collectors.toList());

        // or do it in shorter way:
        List<String> result = strings.stream()
                .limit(4)
                // in sorted we specify as lambda expression Comparator
                // everything in one row
                .sorted((s1, s2) -> s1.compareToIgnoreCase(s2))
                .collect(Collectors.toList());

    }
}
