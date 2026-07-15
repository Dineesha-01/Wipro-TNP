import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class PropertiesDemo {

    public static void main(String[] args) {

        // Create Properties object
        Properties properties = new Properties();

        // Add State and Capital
        properties.setProperty("Andhra Pradesh", "Amaravati");
        properties.setProperty("Telangana", "Hyderabad");
        properties.setProperty("Karnataka", "Bengaluru");
        properties.setProperty("Tamil Nadu", "Chennai");
        properties.setProperty("Kerala", "Thiruvananthapuram");

        // Get all keys
        Set<String> states = properties.stringPropertyNames();

        // Iterator
        Iterator<String> iterator = states.iterator();

        System.out.println("States and their Capitals");
        System.out.println("-------------------------");

        while (iterator.hasNext()) {
            String state = iterator.next();
            System.out.println(state + " --> " + properties.getProperty(state));
        }
    }
}
