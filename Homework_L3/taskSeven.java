package Homework_L3;

import java.util.Scanner;

public class taskSeven {
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);

        System.out.println("Input a number: ");
        int num = input.nextInt();
        int start = 3; 

        for (int i = 1; i <= num; i++){
            if (i == num){
                System.out.print(start);
                
            } else {
                System.out.print(start + ", ");
                
            }
            start = start + 3; 
        }

        input.close();
    }
}
