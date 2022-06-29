package ConditionalStatements.Exercises;

import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        double tourPrice = Double.parseDouble(userInput.nextLine());
        int numOfPuzzles = Integer.parseInt(userInput.nextLine());
        int numOfTalkingDolls = Integer.parseInt(userInput.nextLine());
        int numOfTeddyBears = Integer.parseInt(userInput.nextLine());
        int numOfMinions = Integer.parseInt(userInput.nextLine());
        int numOfTrucks = Integer.parseInt(userInput.nextLine());
        int totalCount = numOfPuzzles + numOfTalkingDolls + numOfTeddyBears + numOfMinions + numOfTrucks;

        double totalPrice = (numOfPuzzles * 2.60) + (numOfTalkingDolls * 3.00) + (numOfTeddyBears * 4.10) + (numOfMinions * 8.20) + (numOfTrucks * 2.00);

        if (totalCount >= 50) {
            totalPrice *= 0.75;
        }

        double moneyLeft_afterRent = totalPrice * 0.90;
        double moneyLeft_afterTour = moneyLeft_afterRent - tourPrice;

        if (moneyLeft_afterRent >= tourPrice) {
            System.out.printf("Yes! %.2f lv left.", moneyLeft_afterTour);
        } else {
            System.out.printf("Not enough money! %.2f lv needed.", Math.abs(moneyLeft_afterTour));
        }
    }
}
