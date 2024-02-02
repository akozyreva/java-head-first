package dataStructures11.genExamples.tasks;

import java.util.ArrayList;
import java.util.List;

/*Write a Java program to create a generic method that
takes two lists of the same type and merges them into a single list.
* */
public class Task5Merge2Lists {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 3, 4);
        List<Integer> numbers2 = List.of(1, 5, 6);
        System.out.println(getMergedList(numbers, numbers2));
    }
    public static <T> List<T> getMergedList(List<T> list1, List<T> list2) {
        List <T> mergedList = new ArrayList<>();
        mergedList.addAll(list1);
        mergedList.addAll(list2);
        return mergedList;
    }
}
