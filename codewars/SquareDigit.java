package codewars;

import java.util.List;
import java.util.stream.Collectors;

/* you are asked to square every digit of a number and concatenate them.

For example, if we run 9119 through the function,
811181 will come out, because 92 is 81 and 12 is 1. (81-1-1-81)


* */

public class SquareDigit {
    public static void main(String[] args) {
        squareDigits(9119);
    }

    public static int squareDigits(int n) {
        String numbers = List.of(String.valueOf(n).split(""))
                .stream().map(num -> (int) Math.pow(Double.parseDouble(num), 2)).
                map(String::valueOf).collect(Collectors.joining());
        System.out.println(numbers);
        return 0;
    }

}