package LambdasStreams_12;
// Write a Java program to implement a lambda expression to find the sum of two integers.
interface SumCalculator {
    int sum(int a, int b);
}

interface NumFunction {
    boolean isOdd(int num);

}
public class LambdaTask1 {
    public static void main(String[] args) {
        SumCalculator sumCalculator = (x, y) -> x + y;
        int result = sumCalculator.sum(7, 6);
        System.out.println("Sum 7,6): " + result);
        NumFunction numFunction = x -> x % 2 == 0;
        System.out.println(numFunction.isOdd(5));
    }
}
