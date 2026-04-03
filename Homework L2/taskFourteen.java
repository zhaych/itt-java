import java.util.Scanner;

public class taskFourteen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Input a position by adding 4 numbers (from 1 to 8): ");
        
        int row = input.nextInt();
        int col = input.nextInt();

        int row2 = input.nextInt();
        int col2 = input.nextInt();

        if ((row + col) % 2 != (row2 + col2) % 2 ){
            System.out.println("The squares are different color.");
        } else {
            System.out.println("The squares are the same color.");
        }
        
        input.close();
    }
}