package com.designpatterns.factory;

public class Laptop implements Computer{
    private String type;
    private String os;
    private int HDD;
    private int RAM;

    public Laptop(String type, String os, int HDD, int RAM) {
        this.type = type;
        this.os = os;
        this.HDD = HDD;
        this.RAM = RAM;
    }
}
