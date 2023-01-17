package z;

import java.io.File;

public class Child extends Parent {
    public Child(String val) {
        i = val;
    }

    @Override
    public void print() throws RuntimeException {
        File f= new File("");
        //FileReader ff= new FileReader(f);
        System.out.println("parent class");
    }

    public static void main(String args[]) {
        Parent p = new Child("sss");
        //p.print();

    }
}
