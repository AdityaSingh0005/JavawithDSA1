import java.util.*;

public class elseIf {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Age: ");

        int age = sc.nextInt();
        System.out.println(age);

        if (age > 18) {
            System.out.println("Adult");
        } else if (age >= 13 && age < 18) {
            System.out.println("Teenager");
        }

        else {
            System.out.println("Not Adult");
        }
    }
}
