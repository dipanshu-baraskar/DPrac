package dip.cmp;

public class MF {
    public static void main(String[] args) {
        System.out.println("Name is " + 'D' + 'B');
        System.out.println("Name is " + ('D' + 'B'));
        System.out.println('D' + 'B');
        System.out.println('D');
        char[] ch = {'a', 'a', 'a', 'b', 'b', 'c', 'c', 'a', 'a', 'b', 'c', 'c', 'd', 'a', 'a', 'b', 'b', 'f'};


        char[] op = remDup(ch);

    }

    public static char[] remDup(char[] ch) {
        int j = 0;
        int length = ch.length;
        for (int i = 0; i < length - 1; i++) {
            if (ch[i] != ch[i + 1]) {
                ch[j] = ch[i];
                j++;
            }
        }
        ch[j] = ch[length - 1];
        j++;
        for (int i = 0; i < j; i++) {
            System.out.print(ch[i] + " ");
        }
        return ch;
    }
/////////1 2 3 4 "5" 6




}
