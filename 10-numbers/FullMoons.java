import static java.lang.System.out;
import java.util.Calendar;

public class FullMoons {
    public static void main(String[] args) {
        final int DAY_IM = 1000 * 60 * 60 * 24;
        Calendar c = Calendar.getInstance();
        c.set(2004, 1, 7,15, 40);
        long day1 = c.getTimeInMillis();
        for (int x = 0; x < 60; x ++) {
            out.println(String.format("full moon on %tc", c));
            day1 += (DAY_IM * 29.52);
            c.setTimeInMillis(day1);
        }
    }
}