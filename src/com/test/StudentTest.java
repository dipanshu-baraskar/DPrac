package com.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student(1, "Dip", "Bar");
        Student s2 = new Student(2, "Amit", "San");
        Student s3 = new Student(3, "Sourav", "Gang");

        List<Student> l = new ArrayList<>();
        l.add(s1);
        l.add(s2);
        l.add(s3);


        Collections.sort(l, new StudentComparator());

        Collections.sort(l, Comparator.comparing(Student::getLastName));

        System.out.println(l);
    }
}
