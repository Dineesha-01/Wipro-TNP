import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class PerfectSquarePredicate {

    public static void main(String[] args) {

        // Create an ArrayList with 10 numbers
        ArrayList<Integer> numbers = new ArrayList<>(
                Arrays.asList(0, 3, 4, 7, 9, 15, 16, 20, 25, 30));

        // Predicate to check perfect square
        Predicate<Integer> isPerfectSquare = num -> {
            int sqrt = (int) Math.sqrt(num);
            return sqrt * sqrt == num;
        };

        System.out.println("Perfect Square Numbers:");

        for (int num : numbers) {
            if (isPerfectSquare.test(num)) {
                System.out.println(num);
            }
        }
    }
}
