import java.util.Scanner;
public class MaxNumDivideFour {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int max = 0;
        for( int i=0; i<size; i++) {
            int curVal = input.nextInt();
            if (curVal % 4 == 0 && curVal > max) max = curVal;
        }
        System.out.println(max);
        
    }

}