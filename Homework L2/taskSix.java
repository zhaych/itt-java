import java.util.Scanner;

public class taskSix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter value for a1: ");
        double a1 = scan.nextDouble();

        System.out.println("Enter value for a2: ");
        double a2 = scan.nextDouble();

        System.out.println("Enter value for a3: ");
        double a3 = scan.nextDouble();

        // example a1 = 5, a2 = 6, a3 = 7
        double temp = a2; // temp = 6
        double temp2 = a3; // temp2 = 7
        a3 = a1; // a3 = 5
        a2 = temp2; // a2 = 7
        a1 = temp;

        System.out.println(a1 + " " + a2 + " " + a3);
        scan.close();
    }
}