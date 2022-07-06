package ConditionalStatementsAdvanced.Exercises;

import java.util.Scanner;

public class SkiTrip {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        int days = Integer.parseInt(userInput.nextLine());
        String roomType = userInput.nextLine();
        String evaluation = userInput.nextLine();

        double price = 0;
        double discount = 0;
        int nights = days - 1;

        switch (roomType) {
            case "room for one person":
                price = 18.00;
                break;
            case "apartment":
                price = 25.00;
                if (nights < 10) {
                    discount = 0.30;
                } else if (nights <= 15) {
                    discount = 0.35;
                } else {
                    discount = 0.50;
                }
                price = price - (price * discount);
                break;
            case "president apartment":
                price = 35.00;
                if (nights < 10) {
                    discount = 0.10;
                } else if (nights <= 15) {
                    discount = 0.15;
                } else {
                    discount = 0.20;
                }
                price = price - (price * discount);
                break;
        }
        if (evaluation.equals("positive")) {
            price = price + (price * 0.25);
        } else if (evaluation.equals("negative")) {
            price = price - (price * 0.10);
        }

        System.out.printf("%.2f", price * nights);
    }
}
