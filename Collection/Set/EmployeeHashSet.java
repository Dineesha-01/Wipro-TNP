import java.util.HashSet;
import java.util.Iterator;

public class EmployeeHashSet {

    public static void main(String[] args) {

        HashSet<String> employees = new HashSet<String>();

        // Adding employee names
        employees.add("Rahul");
        employees.add("Sneha");
        employees.add("Amit");
        employees.add("Priya");
        employees.add("Kiran");

        System.out.println("Employee Names:");

        // Retrieving elements using Iterator
        Iterator<String> iterator = employees.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
