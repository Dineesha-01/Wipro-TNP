import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetOperations {

    public static void main(String[] args) {

        TreeSet<String> treeSet = new TreeSet<String>();

        // Adding String objects
        treeSet.add("Apple");
        treeSet.add("Banana");
        treeSet.add("Orange");
        treeSet.add("Mango");
        treeSet.add("Grapes");

        // (a) Reverse the elements
        System.out.println("Elements in Reverse Order:");
        Iterator<String> reverseIterator = treeSet.descendingIterator();

        while (reverseIterator.hasNext()) {
            System.out.println(reverseIterator.next());
        }

        // (b) Iterate using Iterator
        System.out.println("\nElements using Iterator:");
        Iterator<String> iterator = treeSet.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // (c) Check if a particular element exists
        String search = "Mango";

        if (treeSet.contains(search)) {
            System.out.println("\n" + search + " exists in the TreeSet.");
        } else {
            System.out.println("\n" + search + " does not exist in the TreeSet.");
        }
    }
}