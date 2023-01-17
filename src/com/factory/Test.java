package com.factory;

public class Test {
    public static void main(String[] args) {
       Computer computer= ComputerFactory.getComputer("Laptop");
       if(computer instanceof PC){
           System.out.println("PC");
       } else if (computer instanceof Laptop) {
           System.out.println("Laptop");
       }else {
           System.out.println("NOOOOO");
       }
    }
}
