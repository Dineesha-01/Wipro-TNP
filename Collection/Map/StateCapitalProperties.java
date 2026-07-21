import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class StateCapitalProperties {

    public static void main(String[] args) {

        // Create Properties object
        Properties properties = new Properties();

        // Store States and Capitals
        properties.setProperty("Andhra Pradesh", "Amaravati");
        properties.setProperty("Telangana", "Hyderabad");
        properties.setProperty("Karnataka", "Bengaluru");
        properties.setProperty("Tamil Nadu", "Chennai");
        properties.setProperty("Kerala", "Thiruvananthapuram");

        // Display using Iterator
        System.out.println("States and their Capitals:");
        System.out.println("--------------------------");

        Set<String> states = properties.stringPropertyNames();
        Iterator<String> iterator = states.iterator();

        while (iterator.hasNext()) {
            String state = iterator.next();
            System.out.println("State : " + state +
                               "    Capital : " + properties.getProperty(state));
        }
    }
}