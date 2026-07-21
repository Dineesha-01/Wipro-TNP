import java.util.ArrayList;

class Student {
    int rollNo;
    String name;
    int mark;

    // Parameterized Constructor
    public Student(int rollNo, String name, int mark) {
        this.rollNo = rollNo;
        this.name = name;
        this.mark = mark;
    }
}

public class StudentFilterCount {

    public static void main(String[] args) {

        // Create an ArrayList of Students
        ArrayList<Student> studentList = new ArrayList<>();

        studentList.add(new Student(101, "Rahul", 75));
        studentList.add(new Student(102, "Anjali", 45));
        studentList.add(new Student(103, "Kiran", 60));
        studentList.add(new Student(104, "Sneha", 38));
        studentList.add(new Student(105, "Ravi", 90));

        // Count students who scored at least 50 marks
        long count = studentList.stream()
                .filter(student -> student.mark >= 50)
                .count();

        // Print the result
        System.out.println("Number of Students who cleared the test: " + count);
    }
}