package Homework_L3;

import java.util.Scanner;

public class taskEight {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num = input.nextInt();
        int digit = num - 1;

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                System.out.print(digit);
            }
            System.out.println();
            digit = digit + 2;
        }

        input.close();
    }
}
