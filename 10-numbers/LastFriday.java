import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
public class LastFriday {
 public static void main(String args[]) {
     LocalDate date = LocalDate.now();
     int curMonth = date.getMonthValue();
     for (int i=curMonth; i < 11; i++){
        LocalDate lastFriday = date.plusMonths(i).with(TemporalAdjusters.lastInMonth(DayOfWeek.FRIDAY));
        System.out.println(lastFriday);
     }

 }
}