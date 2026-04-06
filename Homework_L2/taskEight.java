package Homework_L2; 
import java.util.Scanner;

public class taskEight {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Input a number (between 1000-9999):");
        int number = input.nextInt();

        if (number < 1000 || number > 9999) {

            System.out.println("Unvalid number");

        } else {

            int digitOne = number / 1000;
            int digitTwo = (number / 100) % 10;
            int digitThree = (number / 10) % 10;
            int digitFour = number % 10;

            int numberOne = digitOne * 10 + digitFour;
            int numberTwo = digitTwo * 10 + digitThree;

            System.out.println("Those are the two numbers: " + numberOne + " and " + numberTwo);

            if (numberOne > numberTwo) {
                System.out.println("The first number is larger than the second one!");
            } else if (numberTwo > numberOne) {
                System.out.println("The second number is larger than the first one!");
            } else if (numberTwo == numberOne) {
                System.out.println("The numbers are equal!");
            }
        }

        input.close();
    }
}
