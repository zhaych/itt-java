import java.util.Scanner;

public class taskTwo {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter value for A:");
        int A = input.nextInt();

        System.out.println("Enter value for B:");
        int B = input.nextInt();

        System.out.println("Addition: Sum is " + (A + B));
        System.out.println("Subtraction: Difference is " + (A - B));
        System.out.println("Multiplication: Product is " + (A * B));
        System.out.println("Division: Quotient is " + (A / B));
        System.out.println("Euclean Division: Modulus is " + (A % B));

        input.close();
    }
}