import java.util.ArrayList;

public class NumberArrayList {

    public static void main(String[] args) {

        // ArrayList that can store only Number objects
        ArrayList<Number> numbers = new ArrayList<Number>();

        numbers.add(10);        // int
        numbers.add(25.5f);     // float
        numbers.add(45.75);     // double
        numbers.add(100L);      // long
        numbers.add((short)5);  // short
        numbers.add((byte)2);   // byte

        System.out.println("Elements in the ArrayList:");

        for (Number num : numbers) {
            System.out.println(num);
        }

        // The following statement is not allowed:
        // numbers.add("Hello"); // Compile-time error
    }
}
