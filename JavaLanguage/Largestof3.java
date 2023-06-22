
import java.util.*;

public class Largestof3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers: ");

        int A = sc.nextInt();
        // System.out.println(A);
        int B = sc.nextInt();
        // System.out.println(B);
        int C = sc.nextInt();
        // System.out.println(C);

        if ((A > B) && (A > C)) {
            System.out.println("A is largest of 3");
        } else if (B > C) {
            System.out.println("B is largest of 3");
        } else {
            System.out.println("C is largest of 3");
        }

    }
}
