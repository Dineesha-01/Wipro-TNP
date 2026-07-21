public class Employee {

    private int empId;
    private String empName;

    public Employee(int empId, String empName) {
        this.empId = empId;
        this.empName = empName;
    }

    public void display() {
        System.out.println("Employee ID : " + empId);
        System.out.println("Employee Name : " + empName);
    }
}
