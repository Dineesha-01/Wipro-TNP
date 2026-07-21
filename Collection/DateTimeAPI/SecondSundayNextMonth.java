import java.time.LocalDate;
import java.time.DayOfWeek;

public class SecondSundayNextMonth {

    public static void main(String[] args) {

        // Get today's date
        LocalDate today = LocalDate.now();

        // First day of the next month
        LocalDate date = today.plusMonths(1).withDayOfMonth(1);

        // Find the first Sunday
        while (date.getDayOfWeek() != DayOfWeek.SUNDAY) {
            date = date.plusDays(1);
        }

        // Second Sunday
        LocalDate secondSunday = date.plusDays(7);

        System.out.println("Second Sunday of Next Month: " + secondSunday);
    }
}