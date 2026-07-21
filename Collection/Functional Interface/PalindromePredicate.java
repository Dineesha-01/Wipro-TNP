import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class PalindromePredicate {

    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>(Arrays.asList(
                "madam", "apple", "level", "java", "radar",
                "hello", "noon", "world", "racecar", "code"));

        Predicate<String> isPalindrome = word ->
                word.equalsIgnoreCase(new StringBuilder(word).reverse().toString());

        System.out.println("Palindrome Words:");

        words.stream()
             .filter(isPalindrome)
             .forEach(System.out::println);
    }
}
