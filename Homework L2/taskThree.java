import java.util.Scanner;

public class taskThree {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter value for A:");
        double A = scan.nextDouble();

        System.out.println("Enter value for B:");
        double B = scan.nextDouble();

        System.out.printf("B is %.2f and A is %.2f when values are reversed.", A, B);

        scan.close();
    }
}