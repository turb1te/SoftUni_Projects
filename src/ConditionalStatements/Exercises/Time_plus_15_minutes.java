package ConditionalStatements.Exercises;

import java.util.Scanner;

public class Time_plus_15_minutes {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        int hrs = Integer.parseInt(userInput.nextLine()); // 23 hrs
        int min = Integer.parseInt(userInput.nextLine()); // 59 min

        int totalTimeInMin = (hrs * 60) + (min + 15); // (23 * 60) + (59 + 15) = 1454 min

        int finalHours = totalTimeInMin / 60; // 1454 / 60 = 24 hrs
        int finalMinutes = totalTimeInMin % 60; // 1454 % 60 = 14 min

        // Because 24 hrs is not a valid hour, we need to reset the hours to 0.
        if (finalHours == 24) {
            finalHours = 0;
        }

        System.out.printf("%d:%02d", finalHours, finalMinutes); // 0:14
    }
}
