import java.util.Scanner;

public class taskFive {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Enter value for a: ");
    double a = scan.nextDouble();

    System.out.println("Enter value for b: ");
    double b = scan.nextDouble();

    System.out.println("Enter value for c: ");
    double c = scan.nextDouble();

    if (a > b && a > c) {
      if (b > c) {
        System.out.println(a + " " + b + " " + c);
      } else {
        System.out.println(a + " " + c + " " + b);
      }
    } else if (b > a && b > c) {
      if (c > a) {
        System.out.println(b + " " + c + " " + a);
      } else {
        System.out.println(b + " " + a + " " + c);
      }
    } else if (c > a && c > b) {
      if (a > b) {
        System.out.println(c + " " + a + " " + b);
      } else {
        System.out.println(c + " " + b + " " + a);
      }
    }

    scan.close();
  }
}
