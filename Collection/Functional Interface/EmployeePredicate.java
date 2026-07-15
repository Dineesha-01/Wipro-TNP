import java.util.ArrayList;
import java.util.function.Predicate;

class Employee {
    private int id;
    private String name;
    private double salary;

    // Parameterized Constructor
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

public class EmployeePredicate {

    public static void main(String[] args) {

        // Create an ArrayList of Employee objects
        ArrayList<Employee> empList = new ArrayList<>();

        empList.add(new Employee(101, "Rahul", 9000));
        empList.add(new Employee(102, "Anjali", 15000));
        empList.add(new Employee(103, "Kiran", 8000));
        empList.add(new Employee(104, "Sneha", 12000));
        empList.add(new Employee(105, "Ravi", 7000));

        // Predicate to check salary less than 10000
        Predicate<Employee> lowSalary = emp -> emp.getSalary() < 10000;

        System.out.println("Employees whose salary is less than 10000:");

        for (Employee emp : empList) {
            if (lowSalary.test(emp)) {
                System.out.println(emp.getName());
            }
        }
    }
}
