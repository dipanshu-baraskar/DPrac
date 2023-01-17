package com.factory;

public class ComputerFactory {
    public static Computer getComputer(String type) {
        Computer op=null;
//        if (type.equals("PC")) {
//            return new PC(type, "Intel", 3, 0);
//        } else if (type.equals("Laptop")) {
//            return new Laptop(type, "Intel", 3, 0);
//        }

        switch (type) {
            case "PC":
                op = new PC(type, "Intel", 3, 0);
                break;
            case "Laptop":
                op = new Laptop(type, "Intel", 3, 0);
                break;
        }
        return op;
    }
}
