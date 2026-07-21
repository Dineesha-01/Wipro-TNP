import java.util.ArrayList;
import java.util.Iterator;

public class StringArrayList {

    // Method to print all elements using Iterator
    public static void printAll(ArrayList<String> list) {
        Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>();

        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        list.add("Mango");
        list.add("Grapes");

        System.out.println("Elements in the ArrayList:");
        printAll(list);
    }
}