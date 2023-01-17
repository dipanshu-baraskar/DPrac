package com.j8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ReduceDemo {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(4, 2, 5, 2, 7);

        int sum1 = list.stream().mapToInt(value -> value).sum();
        System.out.println(sum1);

        Integer sum = Stream.of(3, 2, 4, 5, 2).reduce(0, (a, b) -> a + b);
        System.out.println(sum);

        Integer integer = list.stream().reduce(Integer::sum).get();
        System.out.println(integer);

        Integer maxValue = list.stream().reduce(1, (a, b) -> a > b ? a : b);
        System.out.println(maxValue);

        Integer maxValueReduce = list.stream().reduce(Integer::max).get();
        System.out.println(maxValueReduce);

        List<String> courses = Arrays.asList("java", "spring", "hibernate");
        String longestString = courses.stream().reduce((s1, s2) -> s1.length() > s2.length() ? s1 : s2).get();
        System.out.println(longestString);
    }
}
