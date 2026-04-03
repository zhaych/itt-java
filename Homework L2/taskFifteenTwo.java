public class taskFifteenTwo {
    public static void main(String[] args) {

        System.out.println("What's the time?");
        int randTime = (int) (Math.random() * 24);

        System.out.println("Time is: " + randTime);

        if (randTime > 24 & randTime < 0) {
            System.out.println("Invalid number!");
        } else if (randTime > 18 && randTime > 4) {
            System.out.println("Good evening!");
        } else if (randTime > 4 && randTime < 9) {
            System.out.println("Good morning!");
        } else {
            System.out.println("Good day!");
        }
    }
}
