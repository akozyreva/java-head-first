package dataStructures11.genExamples.tasks;

import java.util.List;

/*
*  Write a Java program to create a generic method
*  that takes two arrays of the same type and checks
* if they have the same elements in the same order.*/
public class Task1GenMethodListOfNum {
    public static void main(String[] args) {
        List<String> names = List.of("Anna", "Kate", "Alex");
        List<String> names2 = List.of("Anna", "Kate", "Alex");
        List<Integer> ages = List.of(1, 3, 5);
        List<Integer> ages2 = List.of(1, 3, 5);
        compareArr(names, names2);
        compareArr(ages, ages2);
    }

    public static <T> void compareArr(List<?> list1,
                                      List<?> list2) {
        System.out.println(list1.equals(list2));
    }
}
