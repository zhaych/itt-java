package Homework_L3;

import java.util.Scanner;

public class taskEight {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Input number: ");
        int number = input.nextInt();
        int value = number - 1;
        int additive = 2;

        for (int rows = 1; rows <= number; rows++) {
            for (int columns = 1; columns <= number; columns++) {
                System.out.print(value);
            }
            System.out.println();
            value = value + additive;
        }
        input.close();
    }
}
