import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class ExperienceCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Enter joining date
        System.out.print("Enter Joining Year: ");
        int year = sc.nextInt();

        System.out.print("Enter Joining Month: ");
        int month = sc.nextInt();

        System.out.print("Enter Joining Day: ");
        int day = sc.nextInt();

        // Joining date
        LocalDate joiningDate = LocalDate.of(year, month, day);

        // Today's date
        LocalDate today = LocalDate.now();

        // Calculate experience
        Period experience = Period.between(joiningDate, today);

        System.out.println("\nExperience in Wipro:");
        System.out.println("Years  : " + experience.getYears());
        System.out.println("Months : " + experience.getMonths());
        System.out.println("Days   : " + experience.getDays());

        sc.close();
    }
}