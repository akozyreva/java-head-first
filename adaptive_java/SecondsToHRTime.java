import java.util.*;
/*Digital watches display time in the h:mm:ss format (from 0:00:00 to 23:59:59),
 i.e. first goes the number of hours, then goes the two-digit number of minutes,
  followed by the two-digit number of seconds. If necessary, number of minutes and 
  seconds are filled by zeroes to a two-digit number.
N seconds passed from the beginning of the day. Output what the watches will display.*/
public class SecondsToHRTime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int time = input.nextInt();
        int minutes = time/60;

        // basically - how much seconds?
        int sec = time - (minutes * 60);

        //trying to understand, how much hours
        int hours = minutes/60;

        // recalculate minutes
        minutes = minutes - hours * 60;

        //removing extra hours
        if (hours % 24 >= 0) hours = hours - (hours/24)*24;
        // formating output
        // 1:00:02
        String human_readable_time = hours + ":";
        if (minutes < 10) human_readable_time += "0";
        human_readable_time += minutes + ":";
        if (sec < 10)   human_readable_time += "0";
        human_readable_time += sec;

        System.out.println(human_readable_time);
    }
}