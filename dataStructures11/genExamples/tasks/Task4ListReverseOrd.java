package dataStructures11.genExamples.tasks;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/*4. Write a Java program to create a generic method
that takes a list of any type and returns it as a
 new list with the elements in reverse order.
 */
public class Task4ListReverseOrd {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Anna");
        names.add("Kate");

        getReverseList(names);
        System.out.println(names);

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(100);
        getReverseList(numbers);
        System.out.println(numbers);
    }
    public static <T> void getReverseList(List<T> list){
        list.sort((Comparator<? super T>) Comparator.reverseOrder());
    }
}
