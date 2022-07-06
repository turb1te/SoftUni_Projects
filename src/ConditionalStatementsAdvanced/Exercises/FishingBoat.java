package ConditionalStatementsAdvanced.Exercises;

import java.util.Scanner;

public class FishingBoat {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        int budget = Integer.parseInt(userInput.nextLine());
        String season = userInput.nextLine();
        int fishermen = Integer.parseInt(userInput.nextLine());

        double rent = 0;
        double discount = 0;

        if (fishermen <= 6) {
            discount = 0.10;
        } else if (fishermen <= 11) {
            discount = 0.15;
        } else if (fishermen > 12) {
            discount = 0.25;
        }

        switch (season) {
            case "Spring":
                rent = 3000;
                rent = rent - (rent * discount);
                break;
            case "Summer":
            case "Autumn":
                rent = 4200;
                rent = rent - (rent * discount);
                break;
            case "Winter":
                rent = 2600;
                rent = rent - (rent * discount);
                break;
        }

        if (fishermen % 2 == 0 && !season.equals("Autumn")) {
            rent = rent - (rent * 0.05);
        }

        if (rent <= budget) {
            System.out.printf("Yes! You have %.2f leva left.", budget - rent);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", rent - budget);
        }
    }
}
