package Homework_L2;
import java.util.Scanner;

public class taskTwoOne {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter value for A:");
        double A = input.nextDouble();

        System.out.println("Enter value for B:");
        double B = input.nextDouble();

        System.out.println("Addition: Sum is " + (A + B));
        System.out.println("Subtraction: Difference is " + (A - B));
        System.out.println("Multiplication: Product is " + (A * B));
        System.out.println("Division: Quotient is " + (A / B));
        System.out.println("Euclean Division: Modulus is " + (A % B));

        input.close();
    }
}