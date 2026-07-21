import java.util.ArrayList;

public class OddLengthStrings {
    public static void main(String[] args) {

        // Create an ArrayList and add 10 different words
        ArrayList<String> al = new ArrayList<>();

        al.add("Apple");
        al.add("Banana");
        al.add("Mango");
        al.add("Orange");
        al.add("Grapes");
        al.add("Kiwi");
        al.add("Papaya");
        al.add("Cherry");
        al.add("Guava");
        al.add("Peach");

        System.out.println("Strings with odd length:");

        // Lambda expression to print strings with odd length
        al.forEach(word -> {
            if (word.length() % 2 != 0) {
                System.out.println(word);
            }
        });
    }
}
