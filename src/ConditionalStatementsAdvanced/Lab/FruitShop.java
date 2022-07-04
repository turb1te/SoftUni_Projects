package ConditionalStatementsAdvanced.Lab;

import java.util.Scanner;

public class FruitShop {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        String fruit = userInput.nextLine();
        String day = userInput.nextLine();
        double amount = Double.parseDouble(userInput.nextLine());
        double price = 0.00;

        switch (day) {
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                if ("banana".equals(fruit)) {
                    price = 2.50;
                } else if ("apple".equals(fruit)) {
                    price = 1.20;
                } else if ("orange".equals(fruit)) {
                    price = 0.85;
                } else if ("grapefruit".equals(fruit)) {
                    price = 1.45;
                } else if ("kiwi".equals(fruit)) {
                    price = 2.70;
                } else if ("pineapple".equals(fruit)) {
                    price = 5.50;
                } else if ("grapes".equals(fruit)) {
                    price = 3.85;
                } else {
                    price = 0.00;
                }
                break;
            case "Saturday":
            case "Sunday":
                if ("banana".equals(fruit)) {
                    price = 2.70;
                } else if ("apple".equals(fruit)) {
                    price = 1.25;
                } else if ("orange".equals(fruit)) {
                    price = 0.90;
                } else if ("grapefruit".equals(fruit)) {
                    price = 1.60;
                } else if ("kiwi".equals(fruit)) {
                    price = 3.00;
                } else if ("pineapple".equals(fruit)) {
                    price = 5.60;
                } else if ("grapes".equals(fruit)) {
                    price = 4.20;
                } else
                    price = 0.00;
        }

        if (price == 0) {
            System.out.println("error");
        } else {
            System.out.printf("%.2f", price * amount);
        }

    }
}
