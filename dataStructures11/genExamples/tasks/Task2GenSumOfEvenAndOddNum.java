package dataStructures11.genExamples.tasks;

import java.util.List;

/*
Write a Java program to create a generic method that takes a
 list of numbers and returns the sum of all the even and odd numbers.
 */
public class Task2GenSumOfEvenAndOddNum {
    public static void main(String[] args) {
        List<Integer> intNums = List.of(1, 5, 6, 7);
        sumOfAllEvenAndOddNumbers(intNums);
    }

    public static <T extends Number> void sumOfAllEvenAndOddNumbers(List <T> arrNum) {
        double sum = 0;
        for (T t : arrNum) {
            sum += t.doubleValue(); // in order to be sure, that it's double
        }
        System.out.println(sum);
    }
}
