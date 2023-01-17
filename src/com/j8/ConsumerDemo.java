package com.j8;


import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class ConsumerDemo {
    public static void main(String[] args) {
        Consumer c = (n1) -> System.out.println("Print:" + n1);
        c.accept(10);

        List<Integer> list = Arrays.asList(5, 2, 3, 4, 1);

        list.stream().forEach(e1-> System.out.println(e1));
    }
}
