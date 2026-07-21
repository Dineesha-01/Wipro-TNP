import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

class Employee {
    int id;
    String name;
    String location;
    double salary;

    // Parameterized Constructor
    public Employee(int id, String name, String location, double salary) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.salary = salary;
    }
}

public class EmployeeLocationFunction {

    public static void main(String[] args) {

        // Create an ArrayList of Employee objects
        ArrayList<Employee> empList = new ArrayList<>(Arrays.asList(
                new Employee(101, "Rahul", "Pune", 50000),
                new Employee(102, "Anjali", "Hyderabad", 60000),
                new Employee(103, "Kiran", "Chennai", 55000),
                new Employee(104, "Sneha", "Pune", 65000),
                new Employee(105, "Ravi", "Bangalore", 70000)
        ));

        // Function to extract location
        Function<Employee, String> getLocation = emp -> emp.location;

        // Store locations into a new ArrayList
        List<String> locationList = empList.stream()
                .map(getLocation)
                .collect(Collectors.toList());

        // Print location list
        System.out.println("Employee Locations:");
        locationList.forEach(System.out::println);
    }
}
