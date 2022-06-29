package ConditionalStatements.Exercises;

import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        double excursionPrice = Double.parseDouble(userInput.nextLine());
        int numOfPuzzles = Integer.parseInt(userInput.nextLine());
        int numOfTalkingDolls = Integer.parseInt(userInput.nextLine());
        int numOfTeddyBears = Integer.parseInt(userInput.nextLine());
        int numOfMinions = Integer.parseInt(userInput.nextLine());
        int numOfTrucks = Integer.parseInt(userInput.nextLine());

        double totalPrice = (numOfPuzzles * 2.60) + (numOfTalkingDolls * 3.00) + (numOfTeddyBears * 4.10) + (numOfMinions * 8.20) + (numOfTrucks * 2.00);

        if (numOfPuzzles + numOfTalkingDolls + numOfTeddyBears + numOfMinions + numOfTrucks >= 50) {
            totalPrice *= 0.75;
        }

        double moneyAfterRent = totalPrice * 0.90;

        if (moneyAfterRent >= excursionPrice) {
            System.out.printf("Yes! %.2f lv left.", moneyAfterRent - excursionPrice);
        } else {
            System.out.printf("Not enough money! %.2f lv needed.", excursionPrice - moneyAfterRent);
        }
    }
}
