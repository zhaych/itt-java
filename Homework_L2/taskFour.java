package Homework_L2;
import java.util.Scanner;

public class taskFour {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter value for a: ");
        double a = input.nextDouble();

        System.out.println("Enter value for b: ");
        double b = input.nextDouble();

        if (a < b) {
            System.out.println(a + " " + b);
        } else {
            System.out.println(b + " " + a);
        }

        input.close();
    }
}
