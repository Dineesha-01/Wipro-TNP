import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Function;

public class SumUsingFunction {

    public static void main(String[] args) {

        // Create an ArrayList with 10 numbers
        ArrayList<Integer> al = new ArrayList<>(
                Arrays.asList(10, 20, 30, 40, 50, 60, 70, 80, 90, 100));

        // Function to calculate the sum of elements
        Function<ArrayList<Integer>, Integer> sumFunction = list -> {
            int sum = 0;
            for (int num : list) {
                sum += num;
            }
            return sum;
        };

        // Invoke the Function
        int sum = sumFunction.apply(al);

        // Print the result
        System.out.println("ArrayList Elements: " + al);
        System.out.println("Sum of Elements: " + sum);
    }
}