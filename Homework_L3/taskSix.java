package Homework_L3;

import java.util.Scanner;

public class taskSix {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Input number: ");

        int a = input.nextInt();
        int i = 1;
        int temp = 0; 

        for (i = 1; i <= a; i++){
            temp = temp + i; 
        }
        System.out.println(temp);
        input.close();
    }
}
