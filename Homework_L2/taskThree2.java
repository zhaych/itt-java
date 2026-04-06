package Homework_L2;
import java.util.Scanner;

public class taskThree2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter value for A:");
        double A = scan.nextDouble();

        System.out.println("Enter value for B:");
        double B = scan.nextDouble();

        double temp = A;
        A = B;
        B = temp;

        System.out.println("A= " + A + ", B= " + B);

        scan.close();
    }
}