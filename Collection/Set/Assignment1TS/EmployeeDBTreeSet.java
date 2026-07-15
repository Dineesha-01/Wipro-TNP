import java.util.Iterator;
import java.util.TreeSet;

public class EmployeeDBTreeSet {

    TreeSet<Employee> list = new TreeSet<Employee>();

    public boolean addEmployee(Employee e) {
        return list.add(e);
    }

    public boolean deleteEmployee(int empId) {

        Iterator<Employee> iterator = list.iterator();

        while (iterator.hasNext()) {
            Employee e = iterator.next();

            if (e.empId == empId) {
                iterator.remove();
                return true;
            }
        }

        return false;
    }

    public String showPaySlip(int empId) {

        Iterator<Employee> iterator = list.iterator();

        while (iterator.hasNext()) {
            Employee e = iterator.next();

            if (e.empId == empId) {
                return "Pay Slip\nEmployee ID : " + e.empId
                        + "\nEmployee Name : " + e.empName
                        + "\nSalary : " + e.salary;
            }
        }

        return "Employee Not Found";
    }

    public void displayEmployees() {

        Iterator<Employee> iterator = list.iterator();

        while (iterator.hasNext()) {
            Employee e = iterator.next();
            e.getEmployeeDetails();
        }
    }
}
