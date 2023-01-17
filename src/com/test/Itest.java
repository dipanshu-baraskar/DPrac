package com.test;

public class Itest implements I1, I2{
    @Override
    public void display() {
        I1.super.display();
        System.out.println("itest");

    }

    public static void main(String[] args) {
        Itest t= new Itest();
        t.display();
    }
}
