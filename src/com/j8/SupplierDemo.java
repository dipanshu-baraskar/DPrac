package com.j8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String[] args) {
        Supplier<String> s = () -> "Hi Dipanshu";

        System.out.println(s.get());

        List<String> list = Arrays.asList();
        System.out.println(list.stream().findAny().orElse("Hi Dipanshu"));
    }
}
