package Homework_L2;
import java.util.Scanner;

public class taskFifteen {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("What's the time?");
        int time = input.nextInt();

        if (time > 24 & time < 0) {
            System.out.println("Invalid number!");
        } else if (time > 18 && time > 4) {
            System.out.println("Good evening!");
        } else if (time > 4 && time < 9) {
            System.out.println("Good morning!");
        } else {
            System.out.println("Good day!");
        }
        input.close();
    }
}
