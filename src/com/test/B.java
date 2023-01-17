package com.test;

public class B extends A{
    public static void display(){
        System.out.println("in B");

    }

    public static void main(String[] args) {
        A a= new B();
        a.display();

    }
}
