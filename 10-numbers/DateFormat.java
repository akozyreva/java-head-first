import java.time.*;
import java.time.format.DateTimeFormatter;  
import java.time.format.FormatStyle;  
public class DateFormat {
    public static void main(String[] args) {
        // Date is deprecated! Use LocalDate instead
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        System.out.println(date);
        System.out.println(time);

        // we can use DateTimeFormatter for formatting date
        // predefined format
        System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).format(date));
        
        // our pattern
        String pattern = "EEEE, MMM dd yyyy HH:mm:ss";
        DateTimeFormatter DateFormatter = DateTimeFormatter.ofPattern(pattern);
        System.out.println(DateFormatter.format(LocalDateTime.now()));
    }
}