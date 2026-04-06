package Homework_L2;
import java.util.Scanner;

public class taskThirteen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Tell me temperature (Number from -100 to 100): ");
        int temp = input.nextInt();

        if (temp < - 100 || temp > 100){
            System.out.println("Number is invalid!");
        } else if ( temp >= 25 ){
            System.out.println("It's too hot!");
        } else if (  temp >= 15){
            System.out.println("It's warm!");
        } else if (  temp >= 0){
            System.out.println("It's chilly!");
        } else if (  temp >= -20){
            System.out.println("It's cold!");
        } else if (  temp <= -20){
            System.out.println("It's freezing!");
        }
        
        input.close();
    }
    
}
