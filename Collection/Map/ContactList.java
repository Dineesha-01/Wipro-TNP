import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ContactList {

    public static void main(String[] args) {

        // Create HashMap to store Name and Phone Number
        HashMap<String, Integer> contacts = new HashMap<String, Integer>();

        // Add contacts
        contacts.put("Rahul", 123456789);
        contacts.put("Sneha", 234567890);
        contacts.put("Amit", 345678901);
        contacts.put("Priya", 456789012);
        contacts.put("Kiran", 567890123);

        // (a) Check if a particular key exists
        String name = "Rahul";

        if (contacts.containsKey(name)) {
            System.out.println("Key \"" + name + "\" exists.");
        } else {
            System.out.println("Key \"" + name + "\" does not exist.");
        }

        // (b) Check if a particular value exists
        int phoneNumber = 234567890;

        if (contacts.containsValue(phoneNumber)) {
            System.out.println("Phone Number " + phoneNumber + " exists.");
        } else {
            System.out.println("Phone Number " + phoneNumber + " does not exist.");
        }

        // (c) Iterate through the HashMap using Iterator
        System.out.println("\nContact List:");
        System.out.println("-------------");

        Iterator<Map.Entry<String, Integer>> iterator = contacts.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            System.out.println("Name : " + entry.getKey() +
                               "   Phone : " + entry.getValue());
        }
    }
}
