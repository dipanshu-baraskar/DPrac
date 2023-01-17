package com.j8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FilterDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Dip");
        list.add("Mark");
        list.add("Shyam");
        list.add("Kartik");
        list.add("Dharmesh");

        list.stream().filter(n -> n.startsWith("D")).forEach(System.out::println);

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "a");
        map.put(2, "b");
        map.put(3, "c");
        map.put(4, "d");

        map.entrySet().stream().filter(n -> n.getKey() % 2 == 0).forEach(n -> System.out.println(n));
    }
}
