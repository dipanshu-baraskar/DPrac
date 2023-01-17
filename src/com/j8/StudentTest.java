package com.j8;

import zz.Str;

import java.util.*;
import java.util.stream.Collectors;

public class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student(1, "stu1", 10);
        Student s2 = new Student(5, "stu2", 11);
        Student s3 = new Student(18, "stu3", 9);
        Student s4 = new Student(15, "stu4", 14);
        Student s5 = new Student(4, "stu5", 16);

        List<Student> list = Arrays.asList(s1, s2, s3, s4, s5);


        list.stream().filter(s -> s.getAge() > 10).forEach(s -> System.out.println(s.getName()));

        Map<String, Student> studentMap = new HashMap<>();

        studentMap.put("s1", new Student(1, "stu1", 10));
        studentMap.put("s2", new Student(5, "stu2", 11));
        studentMap.put("s3", new Student(18, "stu3", 9));
        studentMap.put("s4", new Student(15, "stu4", 14));
        studentMap.put("s5", new Student(4, "stu5", 16));
        System.out.println();
        studentMap.entrySet().stream()
                .filter(s -> s.getValue().getAge() > 10)
                .forEach(s -> System.out.println(s.getValue().getName()));


    }
}
