package z;

import java.io.*;
import java.math.BigInteger;
import java.nio.channels.FileChannel;

public class Test {
    public static final int end = Integer.MAX_VALUE;
    public static final int start = end - 100;

    public static void main(String[] args) throws Exception {
        String s = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop p";
        String s1 = "I am a, boy";
        readFile(s);
        int count = 0;
        BigInteger a = new BigInteger("5000");
        BigInteger b = new BigInteger("50000");
        BigInteger c = new BigInteger("500000");
        BigInteger t = BigInteger.ZERO;

        t.add(a);
        t.add(b);
        t.add(c);
        System.out.println("*****" + t);

        // File path is passed as parameter
        File file = new File("C:\\Users\\dipb\\Downloads\\test.txt");

        FileReader fileReader = new FileReader(file);
        BufferedReader br = new BufferedReader(fileReader);
        String st;
        while ((st = br.readLine()) != null) {
            System.out.println(st);
            readFile(st);
        }

//        final String a="abc: 6";
//        final String b= "abc: "+a.length();
//        System.out.println("asljdanaljsdas:" +a==b);


    }


    private static void readFile(String s) {

        int words = 0;
        int symbols = 0;
        int characters = 0;
        int spaces = 0;

        try {
            for (int i = 0; i < s.length(); i++) {
                if (Character.isSpaceChar(s.charAt(i))) {
                    words++;
                    spaces++;
                } else if (s.charAt(i) == '.' || s.charAt(i) == ',') {
                    words++;
                }
                if (!Character.isLetter(s.charAt(i)) && !Character.isSpaceChar(s.charAt(i))) {
                    symbols++;
                }
                if (Character.isLetter(s.charAt(i))) {
                    characters++;
                }
            }
            System.out.println("symbols: " + symbols);
            System.out.println("words: " + words);
            System.out.println("characters: " + characters);
            System.out.println("spaces: " + spaces);
        } finally {
            System.out.println("finally");
        }
    }
}
