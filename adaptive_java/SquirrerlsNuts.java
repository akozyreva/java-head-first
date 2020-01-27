import java.util.Scanner;
public class SquirrerlsNuts {
    /* N squirrels found K nuts and decided to divide 
    them equally. Find how many nuts will be left after 
    each of the squirrels takes the equal amount of nuts. */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int K = input.nextInt();
        System.out.println(K%N);

    }
}