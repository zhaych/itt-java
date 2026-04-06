package Homework_L3;

import java.util.Scanner;

public class taskFive {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Input number A: ");
        int a = input.nextInt();

        System.out.println("Input number B: ");
        int b = input.nextInt();

        if (a < b) {
            while (a <= b) {
                System.out.println(a);
                a++;
            }
        } else if (a > b) {
            while (b <= a) {
                System.out.println(b);
                b++;
            }
        } else if (a == b) {
            System.out.println("Numbers are equal!");
        }
        input.close();
    }
}
