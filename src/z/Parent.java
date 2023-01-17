package z;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Parent {
    String i;
    static int j;

    static {
        j = 20;
    }

    Parent() {
        System.out.println(i + " " + j);
    }

    public void print() throws NullPointerException {
        File f = new File("");
        //FileReader ff= new FileReader(f);
        System.out.println("parent class");
    }

}