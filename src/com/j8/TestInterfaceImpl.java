package com.j8;

public class TestInterfaceImpl {
    public static void main(String[] args) {
        TestInterface t= new TestInterface() {
            @Override
            public void m1() {
                System.out.println("class m1");
            }

            @Override
            public void m2() {
                System.out.println("class m2");
            }

            @Override
             public void m3(){
                System.out.println("class m3");
            }
        };

        t.m1();
        t.m2();
        t.m3();
    }
}
