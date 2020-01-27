import java.util.*;
public class Grades2 {
    /*
    Write a program which finds the percentage of students 
    who have received the A grade.
    Used the five-point grading scale with grades
     A, B, C, D and F. */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] grades = input.nextLine().split(" ");
        List<String> list = Arrays.asList(grades);
        int occurrences = Collections.frequency(list, "A");
        System.out.println((float)occurrences/list.size());
        // String[] marks = new Scanner(System.in).nextLine().split(" ");
        // System.out.println((double) Arrays.stream(marks).filter(m -> m.equals("A")).count() / (double) marks.length);
    }
}