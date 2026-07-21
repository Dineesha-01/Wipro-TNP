import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterNegativeEvenNumbers {

    public static void main(String[] args) {

        // Create an ArrayList
        ArrayList<Integer> al = new ArrayList<>(
                Arrays.asList(10, -2, -5, -8, 7, -12, 15, -20, 4, -9));

        // Filter negative even numbers and collect into a new ArrayList
        List<Integer> result = al.stream()
                .filter(n -> n < 0 && n % 2 == 0)
                .collect(Collectors.toList());

        // Print the original ArrayList
        System.out.println("Original ArrayList: " + al);

        // Print the filtered ArrayList
        System.out.println("Negative Even Numbers: " + result);
    }
}