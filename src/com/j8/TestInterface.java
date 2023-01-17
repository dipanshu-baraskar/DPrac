package com.j8;

public interface TestInterface {
    void m1();
    void m2();
    default void m3(){
        System.out.println("default m3");
    }

    static void m4(){
        System.out.println("static m4");
    }
}
