import java.util.*;
import java.util.Scanner;
public class MaxPairwise {
    /*The first input line contains an integer,
    the second — the sequence of integers.
    Print the maximum pairwise product 
    of the two elements of the sequence
    */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        long[] seqNum = new long[size];
        for (int i=0; i<size; i++) seqNum[i] = input.nextInt();
        Arrays.sort(seqNum);
        System.out.println(seqNum[size - 1] * seqNum [size - 2]);
    }
}