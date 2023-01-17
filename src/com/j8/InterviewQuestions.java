package com.j8;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class InterviewQuestions {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 2, 3, 4, 4, 5, 6, 7);

        Set<Integer> duplicatesInAnArray = intList.stream()
                .filter(i -> Collections.frequency(intList, i) > 1)
                .collect(Collectors.toSet());
        System.out.println(duplicatesInAnArray);


        String ip="Hi Hi Hi";

        String[] ipAr=ip.split(" ");
        Map<String, Long> collect = Arrays.stream(ipAr)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect);


    }
}
