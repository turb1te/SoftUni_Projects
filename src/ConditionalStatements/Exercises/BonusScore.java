package ConditionalStatements.Exercises;

import java.util.Scanner;

public class BonusScore {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        int initialPoints = Integer.parseInt(userInput.nextLine());
        double bonusPoints = 0;

        if (initialPoints <= 100) {
            bonusPoints += 5;
        } else if (initialPoints < 1000) {
            bonusPoints = initialPoints * 0.20;
        } else {
            bonusPoints = initialPoints * 0.10;
        }

        if (initialPoints % 2 == 0) {
            bonusPoints += 1;
        }

        if (initialPoints % 10 == 5) {
            bonusPoints += 2;
        }

        System.out.println(bonusPoints);
        System.out.println(initialPoints + bonusPoints);
    }
}
