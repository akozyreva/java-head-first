import java.util.*;
public class SumOfNumbers {
    /*Given the sequence of numbers, ending with number 0. 
    Find the sum of all these numbers without using a loop.*/
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(num);
        while (num != 0) {
            num = input.nextInt();
            list.add(num);
        }
        int sum = list.stream()
                    .mapToInt(i -> i)
                    .sum();
        System.out.println(sum);
        // quicker solution
        // Scanner in = new Scanner(System.in);
        // System.out.println(LongStream.generate(in::nextLong).takeWhile(n -> n != 0).sum());
    }
}