import java.util.ArrayList;
import java.util.Collections;

public class ReverseStringsLambda {

    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<String>();

        // Add 10 different words
        al.add("Apple");
        al.add("Banana");
        al.add("Orange");
        al.add("Mango");
        al.add("Grapes");
        al.add("Cherry");
        al.add("Pineapple");
        al.add("Guava");
        al.add("Papaya");
        al.add("Watermelon");

        // Reverse the ArrayList
        Collections.reverse(al);

        System.out.println("Strings in Reverse Order:");

        // Print using Lambda Expression
        al.forEach(str -> System.out.println(str));
    }
}
