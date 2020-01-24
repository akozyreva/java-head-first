import java.util.Scanner;
import java.lang.Math; 
public class FloorSpace {
    /* Residents of the Malevia country often experiment 
    with the plan of their rooms. Rooms can be triangular, 
    rectangular and round. To quickly calculate the floorage 
    it is required to write a program, which gets the type 
    of the room shape and the relevant parameters as input 
    - the program should output the area of the resulting room.
    The value of 3.14 is used instead of the number π in Malevia.*/
    public static void main(String[] args) {
        Scanner myInput = new Scanner( System.in );
        System.out.print( "Enter room type: " );
        String roomType = myInput.nextLine();
        if(roomType.equals("rectangle")){
            System.out.print( "Enter a: " );
            double a = myInput.nextDouble();
            System.out.print( "Enter b: " );
            double b = myInput.nextDouble();
            System.out.println(Double.toString(a * b));
        } else if (roomType.equals("triangle")) {
            System.out.print( "Enter a: " );
            double a = myInput.nextDouble();
            System.out.print( "Enter b: " );
            double b = myInput.nextDouble();
            System.out.print( "Enter c: " );
            double c = myInput.nextDouble();
            double p = (a + b + c)/2;
            double S = Math.sqrt(p*(p - a) * (p - b) * (p - c));
            System.out.println(S);
        }else if (roomType.equals("circle")) {
            System.out.print( "Enter r: " );
            double r = myInput.nextDouble();
            double Pi = 3.14;
            System.out.println(Double.toString(Pi * r * r));
        }


    }
}