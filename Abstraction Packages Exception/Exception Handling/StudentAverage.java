import java.util.Scanner;

// User Defined Exception for Negative Marks
class NegativeMarksException extends Exception {
    public NegativeMarksException(String message) {
        super(message);
    }
}

// User Defined Exception for Marks Out of Range
class OutOfRangeException extends Exception {
    public OutOfRangeException(String message) {
        super(message);
    }
}

public class StudentAverage {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            for (int i = 1; i <= 2; i++) {

                System.out.println("Enter the name of Student " + i + ":");
                String name = sc.nextLine();

                int sum = 0;

                System.out.println("Enter marks in 3 subjects:");

                for (int j = 1; j <= 3; j++) {

                    int mark = Integer.parseInt(sc.nextLine());

                    if (mark < 0) {
                        throw new NegativeMarksException("NegativeMarksException: Marks cannot be negative");
                    }

                    if (mark > 100) {
                        throw new OutOfRangeException("OutOfRangeException: Marks should be between 0 and 100");
                    }

                    sum += mark;
                }

                double average = (double) sum / 3;

                System.out.println("Student Name : " + name);
                System.out.println("Average Marks : " + average);
            }
        }

        catch (NumberFormatException e) {
            System.out.println("NumberFormatException: Please enter only integer values.");
        }

        catch (NegativeMarksException e) {
            System.out.println(e.getMessage());
        }

        catch (OutOfRangeException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}
