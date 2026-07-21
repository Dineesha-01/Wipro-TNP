import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapOperations {

    public static void main(String[] args) {

        HashMap<String, String> map = new HashMap<String, String>();

        // Adding key-value pairs
        map.put("India", "Delhi");
        map.put("Japan", "Tokyo");
        map.put("USA", "Washington");
        map.put("Australia", "Canberra");

        // (a) Check if a particular key exists
        String key = "India";

        if (map.containsKey(key)) {
            System.out.println("Key \"" + key + "\" exists.");
        } else {
            System.out.println("Key \"" + key + "\" does not exist.");
        }

        // (b) Check if a particular value exists
        String value = "Tokyo";

        if (map.containsValue(value)) {
            System.out.println("Value \"" + value + "\" exists.");
        } else {
            System.out.println("Value \"" + value + "\" does not exist.");
        }

        // (c) Iterate through the HashMap using Iterator
        System.out.println("\nHashMap Elements:");

        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();
            System.out.println("Country: " + entry.getKey() +
                               "  Capital: " + entry.getValue());
        }
    }
}