package dataStructures11.genExamples.tasks;

import java.util.ArrayList;
import java.util.List;

public class Task3ListOccur {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Anna");
        names.add("Kate");
        System.out.println(getIndexOfOccur(names, "Anna"));
        System.out.println(getIndexOfOccur(names, "Alex"));
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(90);
        System.out.println(getIndexOfOccur(numbers, 99));
    }

    public static <T> int getIndexOfOccur(List<T> list, T occur) {
        return list.indexOf(occur);

    }
}
