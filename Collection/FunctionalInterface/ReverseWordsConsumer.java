import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;

public class ReverseWordsConsumer {

    public static void main(String[] args) {

        // Create an ArrayList with 10 words
        ArrayList<String> words = new ArrayList<>(Arrays.asList(
                "Apple", "Banana", "Mango", "Orange", "Grapes",
                "Cherry", "Guava", "Papaya", "Peach", "Kiwi"));

        System.out.println("Original ArrayList:");
        System.out.println(words);

        // Consumer to reverse each word and update the same ArrayList
        Consumer<ArrayList<String>> reverseWords = list -> {
            for (int i = 0; i < list.size(); i++) {
                String reversed = new StringBuilder(list.get(i)).reverse().toString();
                list.set(i, reversed);
            }
        };

        // Invoke Consumer
        reverseWords.accept(words);

        System.out.println("\nUpdated ArrayList:");
        System.out.println(words);
    }
}