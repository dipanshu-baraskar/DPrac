package com.practice;

import java.util.HashMap;
import java.util.Objects;

public class Emp {
    int id;
    String name;

    public Emp(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        return false;
    }

    @Override
    public int hashCode() {
        return 1;
    }

    public static void main(String[] args) {
        Emp e1 = new Emp(1, "a");
        Emp e2 = new Emp(1, "a");
        Emp e3 = new Emp(1, "a");

        HashMap<Emp, Integer> m = new HashMap<>();
        m.put(e1, 1);
        m.put(e2, 2);
        m.put(e3, 3);

        System.out.println(m);

        System.out.println(m.get(e1));
        System.out.println(m.get(e2));
        System.out.println(m.get(e3));

        System.out.println(m.size());


    }
}
