package Homework_L2;
import java.util.Scanner;

public class taskNine {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter  a number (between 10 and 99): ");
        int a = input.nextInt();

        System.out.println("Enter  a number (between 10 and 99): ");
        int b = input.nextInt();

        if (a >= 10 && a <= 99 && b >= 10 && b <= 99) {
            int c = a * b;
            int digitThree = c % 10;
            if (digitThree % 2 == 0) {
                System.out.println(digitThree + " is even.");
            } else {
                System.out.println(digitThree + " is odd.");
            }
        } else {
            System.out.println("One of your numbers, or both of them are not within the range.");
        }

        input.close();
    }

}
