package Homework_L2;
import java.util.Scanner;

public class taskSixteen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Input a number (between 100 & 999): ");

        int number = input.nextInt();

        if (number >= 100 && number <= 999){
            int firstDigit = (number / 100) % 10; 
            int secondDigit = (number / 10) % 10;
            int thirdDigit = number % 10; 

            if (firstDigit == secondDigit && secondDigit == thirdDigit && firstDigit == thirdDigit){
                System.out.println("Digits are equal!");
            } else if (firstDigit > secondDigit && secondDigit > thirdDigit){
                System.out.println("Digits are in condescending order!");
            } else if (firstDigit < secondDigit && secondDigit < thirdDigit){
                System.out.println("Digits are in ascending order!");
            } else {
                System.out.println("Digits are not in any order!");
            }
        } else {
            System.out.println("Invalid number!");
        }
        input.close();
    }
}
