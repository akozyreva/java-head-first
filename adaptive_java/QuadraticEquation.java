import java.util.*;
/*
Given real numbers a, b, c, where a ≠ 0.
Solve the quadratic equation ax^2 + bx + c = 0 and output all of its roots.
If the equation has two roots, output these two roots in ascending order; 
if one root - output a single number; if no roots – do not output anything. 
*/
public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        double D = b * b - 4 * a * c;
        double x1 = 0;
        double x2 = 0;
        if(D == 0) {
            x1 = (-b + Math.sqrt(D))/(2*a);
            System.out.println(x1);
        }
        if(D > 0) {
            x1 = (-b + Math.sqrt(D))/(2*a);
            x2 = (-b - Math.sqrt(D))/(2*a);
            if (x2 > x1) {
                System.out.println(x1 + " " + x2);
            } else {
                System.out.println(x2 + " " + x1);
            }
        }
       

    }
}