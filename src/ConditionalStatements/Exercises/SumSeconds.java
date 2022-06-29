package ConditionalStatements.Exercises;

import java.util.Scanner;

public class SumSeconds {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        // The input is in seconds.
        int firstTime = Integer.parseInt(userInput.nextLine());
        int secondTime = Integer.parseInt(userInput.nextLine());
        int thirdTime = Integer.parseInt(userInput.nextLine());

        int sumTime = firstTime + secondTime + thirdTime;

        int minutes = sumTime / 60;
        int seconds = sumTime % 60;

//        if (seconds < 10) {
//            System.out.printf("%d:0%d", minutes, seconds);
//        } else {
//            System.out.printf("%d:%d", minutes, seconds);
//        }
        System.out.printf("%d:%02d", minutes, seconds);
    }
}
