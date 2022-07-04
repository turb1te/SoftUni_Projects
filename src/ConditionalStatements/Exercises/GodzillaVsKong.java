package ConditionalStatements.Exercises;

import java.util.Scanner;

public class GodzillaVsKong {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        double budget = Double.parseDouble(userInput.nextLine());
        int peoples = Integer.parseInt(userInput.nextLine());
        double dressPrice = Double.parseDouble(userInput.nextLine());

        double decor = budget * 0.10;
        double totalDress = 0;

        if (peoples > 150) {
            totalDress = (dressPrice * 0.90) * peoples;
        }
        else {
            totalDress = dressPrice * peoples;
        }

        double total = totalDress + decor;

        if (total > budget) {
            System.out.printf("Not enough money!%nWingard needs %.2f leva more.", total - budget);
        } else {
            System.out.printf("Action!%nWingard starts filming with %.2f leva left.", budget - total);
        }
    }
}
