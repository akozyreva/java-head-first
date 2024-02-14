package LambdasStreams_12;

import java.util.function.Predicate;

// Write a Java program to implement a lambda expression
// to check if a given string is empty.
interface StringFunction{
    boolean isEmpty(String word);
}

public class LambdaTask2 {
    public static void main(String[] args) {
        Predicate <String> isEmptyString = str -> str.isEmpty();
        StringFunction stringFunction = s -> s.length() == 0;
        String word = "test";
        System.out.println(stringFunction.isEmpty(word));
        isEmptyString.test(word);
    }
}
