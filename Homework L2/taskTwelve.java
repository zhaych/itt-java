import java.util.Scanner;

public class taskTwelve {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int day = input.nextInt();
        int month = input.nextInt();
        int year = input.nextInt();

        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0 || year % 400 == 0);
        int lastDay = 0;

        if (month == 1) {
            lastDay = 31;
        } else if (month == 2) {
            if (isLeapYear) {
                lastDay = 29;
            } else {
                lastDay = 28;
            }
        } else if (month == 3) {
            lastDay = 31;
        } else if (month == 4) {
            lastDay = 30;
        } else if (month == 5) {
            lastDay = 31;
        } else if (month == 6) {
            lastDay = 30;
        } else if (month == 7) {
            lastDay = 31;
        } else if (month == 8) {
            lastDay = 31;
        } else if (month == 9) {
            lastDay = 30;
        } else if (month == 10) {
            lastDay = 31;
        } else if (month == 11) {
            lastDay = 30;
        } else if (month == 12) {
            lastDay = 31;
        }

        if (day < lastDay) {
            day++;
        } else if (month == 12) {
            day = 1;
            month = 1;
            year++;
        } else {
            day = 1;
            month++;
        }

        System.out.println(day + " , " + month + " , " + year);
        input.close();
    }
}
