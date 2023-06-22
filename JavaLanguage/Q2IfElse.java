
import java.util.*;

public class Q2IfElse {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Marks: ");

        int marks = sc.nextInt();

        String status = ((marks >= 33) ? "PASS" : "FAIL");
        System.out.println(status);
    }
}
