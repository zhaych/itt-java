package Homework_L3;

import java.util.Scanner;

public class taskEight {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Input number: ");
        int number = input.nextInt();
        int value = number - 1;
        int i = 0;
        int j = 0;
        int add = 2;

        for (i = 1; i <= number; i++) {
            for (j = 1; j <= number; j++) {
                System.out.print(value);
            }
            System.out.println();
            value = value + add;
        }

        input.close();
    }
}
