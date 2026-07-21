import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class EmployeeVectorDemo {

    public static void main(String[] args) {

        Vector<Employee> vector = new Vector<Employee>();

        vector.add(new Employee(101, "Rahul", "rahul@gmail.com", "Male", 50000));
        vector.add(new Employee(102, "Sneha", "sneha@gmail.com", "Female", 60000));
        vector.add(new Employee(103, "Amit", "amit@gmail.com", "Male", 55000));

        System.out.println("Using Iterator");
        System.out.println("--------------");

        Iterator<Employee> iterator = vector.iterator();

        while (iterator.hasNext()) {
            Employee e = iterator.next();
            e.getEmployeeDetails();
        }

        System.out.println("Using Enumeration");
        System.out.println("-----------------");

        Enumeration<Employee> enumeration = vector.elements();

        while (enumeration.hasMoreElements()) {
            Employee e = enumeration.nextElement();
            e.getEmployeeDetails();
        }
    }
}
