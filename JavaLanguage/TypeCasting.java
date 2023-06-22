
import java.util.*;

public class TypeCasting {
    public static void main(String args[]) {
        // Scanner sc = new Scanner(System.in);
        // float a = 25.12f;
        // int b = (int) a;
        // System.out.println(b);
        // float marks = 99.99f;
        // int b = (int) marks;
        // System.out.println(b);4

        // char ch = 'b';
        // int number = ch;
        // System.out.println(number);

        // Type Promotion
        // char a = 'a';
        // char b = 'b';
        // char c = 'c';
        // System.out.println((int) (b));
        // System.out.println((int) (a));
        // System.out.println(b - a);
        // System.out.println((int) (c));

        // short a = 5;
        // byte b = 25;
        // char c = 'c';
        // byte bt = (byte) (a + b + c);
        // System.out.println(bt);

        int a = 10;
        float b = 20.25f;
        long c = 25;
        double d = 30;
        double ans = a + b + c + d;
        int ans2 = (int) (a + b + c + d);
        System.out.println(ans);
        System.out.println(ans2);
        System.out.println(a + b + c + d);
    }
}