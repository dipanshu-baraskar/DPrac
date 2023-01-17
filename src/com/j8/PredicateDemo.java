package com.j8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {
        Predicate<Integer> p = (integer) -> integer % 2 == 0;

        System.out.println(p.test(10));

        List<Integer> list = Arrays.asList(5, 2, 3, 4, 1);
        list.stream().filter(integer -> integer % 2 == 0).forEach(integer -> System.out.println("Even number in list:"+integer));
    }
}
