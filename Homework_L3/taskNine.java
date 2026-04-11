package Homework_L3;

import java.util.Scanner;

public class taskNine {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Input number A: ");
        int A = input.nextInt();

        System.out.println("Input number B: ");
        int B = input.nextInt();

        int i = 0; 
        int sum = 0;
        boolean isFirst = true;

        for (i = A; i <= B; i++) {
            if (isFirst) {
                isFirst = false;
            } else {
                System.out.print(", ");
            }
            if (i % 3 == 0) {
                System.out.print("skip 3");
            } else {
                System.out.print(i * i);
                sum = sum + i * i;
            }
            if (sum > 200) {
                break;
            }
        }
        input.close();
    }
}
