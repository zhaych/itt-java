package Homework_L2;
import java.util.Scanner;

public class taskSeven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("What's the time? (hours)");
        int time = input.nextInt();
        if (time > 24 && time > 0) {
            System.out.println("Invalid time.");
        }

        System.out.println("How much money do you have?");
        double money = input.nextDouble();

        System.out.println("Are you sick? True or False");
        boolean isSick = input.nextBoolean();

        if (isSick) {

            System.out.println("I am sick, I will not go out.");

            if (money > 0) {
                System.out.println("If I have money, I'll buy medicine.");
            } else {
                System.out.println("I don't have money, so I'll just stay home and drink tea.");
            }

        } else if (!isSick) {

            System.out.println("I am healthy!");

            if (money >= 10) {
                System.out.println("I am healthy, so I'll go to the movies with friends.");
            } else if (time > 19 && time < 5) {
                System.out.println("It's too late to do anything! Time to sleep!");
            } else {
                System.out.println("I have less than 10$, so I will go for a coffee.");
            }
        }
        input.close();
    }
}
