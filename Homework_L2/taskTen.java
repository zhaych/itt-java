package Homework_L2;
import java.util.Scanner;

public class taskTen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Input value for the volume of the vessel (between 10-9999): ");
        int volume = input.nextInt();

        int twolitre = 2;
        int threelitre = 3;

        if (volume >= 10 && volume <= 9999) {

            int bucketsvol = twolitre + threelitre;

            int buckettotal = volume / bucketsvol;
            int buckettwol = buckettotal;
            int bucketthreel = buckettotal;

            int remainder = volume % bucketsvol;

            System.out.println("Water remained: " + remainder);

            if (remainder == 0) {
                System.out.println("Number of 2l buckets: " + buckettwol + ".  Number of 3l buckets: " + bucketthreel);
            } else if (remainder == 1) {

                System.out.println("Two additional 3l buckets.");
                buckettwol = buckettwol - 1;
                bucketthreel = bucketthreel + 2;
                System.out.println("Number of 2l buckets: " + buckettwol + ".  Number of 3l buckets: " + bucketthreel);

            } else if (remainder == 2) {

                System.out.println("One additional 2l bucket. ");
                buckettwol = buckettwol + 1;
                System.out.println("Number of 2l buckets: " + buckettwol + ".  Number of 3l buckets: " + bucketthreel);

            } else if (remainder == 3) {

                System.out.println("One additional 3l bucket. ");
                bucketthreel = bucketthreel + 1;
                System.out.println("Number of 2l buckets: " + buckettwol + ".  Number of 3l buckets: " + bucketthreel);

            } else if (remainder == 4) {

                System.out.println("One additional 2l bucket and one additional 3l bucket.");
                buckettwol = buckettwol + 1;
                bucketthreel = bucketthreel + 1;
                System.out.println("Number of 2l buckets: " + buckettwol + ".  Number of 3l buckets: " + bucketthreel);
            }

        } else {
            System.out.println("Invalid number!");
        }
        input.close();
    }
}
