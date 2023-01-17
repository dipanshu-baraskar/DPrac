package com.j8;

import java.util.List;
import java.util.stream.Collectors;

public class MapVsFlatMapDemo {
    public static void main(String[] args) {
        List<Customer> list = CustomerDatabase.getAllCustomers();

        //converting List<Customer> to  List<String> mailList = Data Transformation
        //mapping logic = c -> c.getEmail()
        //one customer has one email = one to one mapping
        List<String> mailList = list.stream().map(c -> c.getEmail()).collect(Collectors.toList());
        System.out.println(mailList);

        //c -> c.getPhoneNumbers() = one to many as 1 customer can have multiple phone numbers
        //in case of nested list we can go for flatmap
        //below function will return List<List<String>>
        List<List<String>> phoneNumberList = list.stream().map(c -> c.getPhoneNumbers()).collect(Collectors.toList());
        System.out.println(phoneNumberList);

        //converting List<Customer> to  List<String> mailList = Data Transformation
        //mapping : customer -> phone Numbers
        //c-> c.getPhoneNumbers() : one to many mapping
        //below function will return List<String>
        List<String> phoneNumberFlatList=list.stream().flatMap(c-> c.getPhoneNumbers().stream()).collect(Collectors.toList());
        System.out.println(phoneNumberFlatList);
    }
}
