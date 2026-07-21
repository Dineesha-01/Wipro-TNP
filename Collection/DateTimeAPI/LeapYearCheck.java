import java.time.LocalDate;

public class LeapYearCheck {

    public static void main(String[] args) {

        // Get the current date
        LocalDate today = LocalDate.now();

        // Get the current year
        int year = today.getYear();

        // Check whether it is a leap year
        if (today.isLeapYear()) {
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is Not a Leap Year.");
        }
    }
}