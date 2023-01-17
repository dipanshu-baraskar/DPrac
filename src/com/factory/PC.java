package com.factory;

public class PC implements Computer{
    private String type;
    private String os;
    private int HDD;
    private int RAM;

    public PC(String type, String os, int HDD, int RAM) {
        this.type = type;
        this.os = os;
        this.HDD = HDD;
        this.RAM = RAM;
    }
}
