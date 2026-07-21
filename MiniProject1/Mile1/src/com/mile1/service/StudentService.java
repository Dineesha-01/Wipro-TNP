package com.mile1.service;

import com.mile1.bean.Student;

public class StudentService {

    public int findNumberOfNullMarksArray(Student s[]) {

        int count = 0;

        if (s != null) {

            for (int i = 0; i < s.length; i++) {

                if (s[i] != null && s[i].getMarks() == null)
                    count++;
            }
        }

        return count;
    }

    public int findNumberOfNullName(Student s[]) {

        int count = 0;

        if (s != null) {

            for (int i = 0; i < s.length; i++) {

                if (s[i] != null && s[i].getName() == null)
                    count++;
            }
        }

        return count;
    }

    public int findNumberOfNullObjects(Student s[]) {

        int count = 0;

        if (s != null) {

            for (int i = 0; i < s.length; i++) {

                if (s[i] == null)
                    count++;
            }
        }

        return count;
    }
}