package com.j8;

import zz.Str;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public class ForEachDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Dip");
        list.add("Mark");
        list.add("Shyam");
        list.add("Kartik");

        list.stream().forEach((n) -> System.out.println(n));

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "a");
        map.put(2, "b");
        map.put(3, "c");
        map.put(4, "d");

        map.forEach((key, val) -> System.out.println(key + " is " + val));

        map.entrySet().stream().forEach(e -> System.out.println(e.getValue()));
        map.entrySet().stream().forEach(e -> System.out.println(e.getKey()));

        //Internally foreach will run as below
        Consumer cc = (n) -> System.out.println(n);
        for (String ss : list) {
            System.out.println(ss);
        }
    }
}
