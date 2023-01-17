package com.j8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalDemo {

    public static Customer getCustomerByEmail(String email) {
        List<Customer> customers = CustomerDatabase.getAllCustomers();

//        return customers.stream()
//                .filter(customer -> customer.getEmail()
//                        .equals(email)).findAny().orElseThrow(() -> ne    w RuntimeException("not allowed"));
        return customers.stream().filter(customer -> customer.getEmail().equals(email)).findAny().orElse(new Customer());

    }

    public static void main(String[] args) {
        Customer customer = new Customer(1, "Dip", "dip", Arrays.asList("98798", "8978798", "1235498"));

        System.out.println(getCustomerByEmail("dip"));

        //empty
        //of
        //ofNullable

        Optional op = Optional.empty();
        System.out.println(op);
        //if we are sure that object is not going to null we can create object using Optional.of()
//        Optional<String> op1 = Optional.of(customer.getEmail());

        Optional<String> op2 = Optional.ofNullable(customer.getEmail());
//        if (op2.isPresent()) {
//            System.out.println(op2.get());
//        }
        System.out.println(op2.orElse("not found"));
//        System.out.println(op2.orElseThrow(() -> new IllegalArgumentException("not valid")));
        System.out.println(op2.map(String::toUpperCase).orElseGet(() -> "default email"));


    }
}
