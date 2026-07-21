package com.mile1.main;

import com.mile1.bean.Student;
import com.mile1.service.StudentReport;
import com.mile1.service.StudentService;

public class StudentMain {

    static Student data[] = new Student[4];

    public StudentMain() {

        data[0] = new Student("Sekar", new int[] {85,75,95});
        data[1] = new Student(null, new int[] {11,22,33});
        data[2] = null;
        data[3] = new Student("Manoj", null);
    }

    public static void main(String[] args) {

        StudentMain obj = new StudentMain();

        StudentReport report = new StudentReport();

        for (int i = 0; i < data.length; i++) {

            try {

                if (report.validate(data[i]).equals("VALID")) {

                    String grade = report.findGrades(data[i]);
                    System.out.println(data[i].getName() + " Grade : " + grade);
                }

            } catch (Exception e) {

                System.out.println(e);
            }
        }

        StudentService service = new StudentService();

        System.out.println("Null Marks Array : "
                + service.findNumberOfNullMarksArray(data));

        System.out.println("Null Names : "
                + service.findNumberOfNullName(data));

        System.out.println("Null Objects : "
                + service.findNumberOfNullObjects(data));
    }
}
