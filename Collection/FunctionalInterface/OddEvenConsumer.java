import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;

public class OddEvenConsumer {

    public static void main(String[] args) {

        // Create an ArrayList with 10 numbers
        ArrayList<Integer> numbers = new ArrayList<>(
                Arrays.asList(2, 5, 8, 11, 14, 17, 20, 23, 26, 29));

        // Consumer to display number and whether it is odd or even
        Consumer<Integer> checkOddEven = num -> {
            if (num % 2 == 0) {
                System.out.println(num + " even");
            } else {
                System.out.println(num + " odd");
            }
        };

        // Invoke Consumer for each element
        numbers.forEach(checkOddEven);
    }
}