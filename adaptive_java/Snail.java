import java.util.Scanner;
public class Snail {
/* Snail creeps up the vertical pole of height H feets. 
Per day it goes A feets up, and per night it goes B feets down. 
In which day the snail will reach the top of the pole?
On the input the program receives non-negative integers H, A, B, where H > B and A > B. 
Every integer does not exceed 100.*/
    public static void main(String[] args) {
        Scanner myInput = new Scanner( System.in );
        System.out.print( "Enter Height: " );
        int H = myInput.nextInt();
        System.out.print("Enter the number of feets up: ");
        int A = myInput.nextInt();
        System.out.print("Enter the number of feets down: ");
        int B = myInput.nextInt();
        int days = 0;
        int distance = 0;
        while (distance < H) {
            days += 1;
            distance += A;
            System.out.println("Day= " + Integer.toString(days) + " distance= " + Integer.toString(distance));
            if(distance < H) {
                distance -=B;
            } else {    
                break;
            }
        }
        System.out.println(days);
    }
}