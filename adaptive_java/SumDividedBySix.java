import java.util.Scanner;
public class SumDividedBySix {
    /*
    Given the sequence of natural numbers. 
    Find the sum of numbers, divisible by 6.
    The input is number of elements in the sequence, 
    and then the elements themselves. 
    In this sequence, there is always a number, divisible by 6. */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int sum = 0;
        for( int i=0; i<size; i++) {
            int num = input.nextInt();
            if (num % 6 == 0) sum += num;
        }
        System.out.println(sum);
    }
}