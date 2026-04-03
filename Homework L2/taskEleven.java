import java.util.Scanner;

public class taskEleven {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number (between 100-999): ");
        int number = input.nextInt();

        if (number >= 100 && number <= 999) {

            int firstDigit = number / 100;
            int secondDigit = number / 10;
            int thirdDigit = number % 10;

            if (firstDigit == 0 || secondDigit == 0 || thirdDigit == 0) {

                System.out.println("One of the digits in the number is 0.");

            } else if (number % firstDigit == 0 && number % secondDigit == 0 || number % thirdDigit == 0) {
                System.out.println("Number is divisible by its digits.");
            } else {
                System.out.println("Number is not divisible by its digits.");
            }

        } else {
            System.out.println("Invalid number!");
        }
        
        input.close();
    }
}
