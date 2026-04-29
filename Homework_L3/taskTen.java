package Homework_L3;

import java.util.Scanner; 

public class taskTen {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Input a number:");

        int number = input.nextInt();
        boolean isPrime = true;

        for (int i = 2; i <= number - 1; i++ ){
            if (number % i == 0){
                isPrime = false;
                break;
            }
        } 

        if (isPrime && number > 1){
            System.out.println("Prime");
        } 
        else {
            System.out.println("Not prime");
        }
    }

}