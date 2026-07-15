import java.util.ArrayList;
import java.util.Iterator;

public class EmployeeDB {

    ArrayList<Employee> list = new ArrayList<>();

    public boolean addEmployee(Employee e) {
        return list.add(e);
    }

    public boolean deleteEmployee(int empId) {
        Iterator<Employee> it = list.iterator();

        while (it.hasNext()) {
            Employee e = it.next();

            if (e.empId == empId) {
                it.remove();
                return true;
            }
        }

        return false;
    }

    public String showPaySlip(int empId) {

        for (Employee e : list) {
            if (e.empId == empId) {
                return "Pay Slip\nEmployee ID : " + e.empId +
                        "\nEmployee Name : " + e.empName +
                        "\nSalary : " + e.salary;
            }
        }

        return "Employee Not Found";
    }

    public void displayEmployees() {
        Iterator<Employee> it = list.iterator();

        while (it.hasNext()) {
            Employee e = it.next();
            e.getEmployeeDetails();
        }
    }
}
