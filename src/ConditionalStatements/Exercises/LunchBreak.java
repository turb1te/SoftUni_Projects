package ConditionalStatements.Exercises;

import java.util.Scanner;

public class LunchBreak {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        String serialName = userInput.nextLine();
        int episodeDuration = Integer.parseInt(userInput.nextLine());
        int breakDuration = Integer.parseInt(userInput.nextLine());

        double lunchDuration = breakDuration * 0.125;
        double restDuration = breakDuration * 0.25;

        double totalTime = episodeDuration + lunchDuration + restDuration;
        double freeTime = Math.abs(breakDuration - totalTime);

        if (breakDuration >= totalTime) {
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", serialName, Math.ceil(freeTime));
        } else {
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", serialName, Math.ceil(freeTime));
        }
    }
}
