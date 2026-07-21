import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Employee {
    int empNo;
    String name;
    int age;
    String location;

    // Parameterized Constructor
    public Employee(int empNo, String name, int age, String location) {
        this.empNo = empNo;
        this.name = name;
        this.age = age;
        this.location = location;
    }

    // Display Employee Details
    public void display() {
        System.out.println("Emp No   : " + empNo);
        System.out.println("Name     : " + name);
        System.out.println("Age      : " + age);
        System.out.println("Location : " + location);
        System.out.println();
    }
}

public class EmployeeFilter {

    public static void main(String[] args) {

        // Create an ArrayList of Employees
        ArrayList<Employee> empList = new ArrayList<>();

        empList.add(new Employee(101, "Rahul", 25, "Pune"));
        empList.add(new Employee(102, "Anjali", 28, "Hyderabad"));
        empList.add(new Employee(103, "Kiran", 30, "Pune"));
        empList.add(new Employee(104, "Sneha", 27, "Chennai"));
        empList.add(new Employee(105, "Ravi", 29, "Pune"));

        // Filter employees whose location is Pune
        List<Employee> puneEmployees = empList.stream()
                .filter(emp -> emp.location.equalsIgnoreCase("Pune"))
                .collect(Collectors.toList());

        // Print filtered employees
        System.out.println("Employees from Pune:\n");

        puneEmployees.forEach(Employee::display);
    }
}