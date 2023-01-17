package z;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Password {

    public static void main(String[] args) {

        String strPwd = "password";
        char[] charPwd = new char[]{'p', 'a', 's', 's', 'w', 'o', 'r', 'd'};

        System.out.println("String password: " + strPwd);
        System.out.println("Character password: " + charPwd);
        String s1="Dipa";
        String s2="Dipa";
        String s3=new String("Dip");
        String s4=s3.intern();
        System.out.println(s1==s3);
        System.out.println(s1==s4);

        List l = new LinkedList();
        Queue q= new LinkedList();
    }
}
