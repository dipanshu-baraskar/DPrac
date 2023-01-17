package com.j8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CustomerDatabase {
    public static List<Customer> getAllCustomers() {
        return Stream.of(new Customer(101, "John", "John@gmail.com", Arrays.asList("987", "7898","45354846")),
                        new Customer(104, "Smith", "Smith@gmail.com", Arrays.asList("456", "789634")),
                        new Customer(102, "Kary", "Kary@gmail.com", Arrays.asList("2321", "345654")),
                        new Customer(105, "Paul", "Paul@gmail.com", Arrays.asList("87954", "7893158","12354843","235484")))
                .collect(Collectors.toList());
    }
}
