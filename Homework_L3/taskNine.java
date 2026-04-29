package Homework_L3;

import java.util.Scanner;

public class taskNine {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Input number A: ");
        int A = input.nextInt();

        System.out.println("Input number B: ");
        int B = input.nextInt();

        boolean isFirst = true;
        int maxValue = 200;
        int divider = 3; 

        for (int number = A; number <= B; number++) {
            if (isFirst) {
                isFirst = false;
            } else {
                System.out.print(", ");
            }
            if (number % divider == 0) {
                System.out.print("skip 3");
            } else {
                System.out.print(number * number);
                int sum = sum + number * number;
            }
            if (sum > maxValue) {
                break;
            }
        }
        input.close();
    }
}
