package Homework_L2;
import java.util.Scanner;

public class taskOne {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter value for A:");
        double A = input.nextDouble();

        System.out.println("Enter value for B:");
        double B = input.nextDouble();

        System.out.println("Enter value for C:");
        double C = input.nextDouble();

        if ((C > A && C < B) || (C > B && C < A)) {
            System.out.printf("%.2f is between %.2f and %.2f%n", C, A, B);
        } else {
            System.out.printf("%.2f is NOT between %.2f and %.2f%n", C, A, B);
        }
        input.close();
    }
}