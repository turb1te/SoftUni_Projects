package ConditionalStatementsAdvanced.Exercises;

import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        String flowersType = userInput.nextLine();
        int flowersCount = Integer.parseInt(userInput.nextLine());
        int budget = Integer.parseInt(userInput.nextLine());

        double priceRoses = 5.00;
        double priceDahlias = 3.80;
        double priceTulips = 2.80;
        double priceNarcissus = 3.00;
        double priceGladiolus = 2.50;

        double price = 0;

        switch (flowersType) {
            case "Roses":
                price = flowersCount * priceRoses;
                if (flowersCount > 80) {
                    price -= price * 0.10;
                }
                break;
            case "Dahlias":
                price = flowersCount * priceDahlias;
                if (flowersCount > 90) {
                    price -= price * 0.15;
                }
                break;
            case "Tulips":
                price = flowersCount * priceTulips;
                if (flowersCount > 80) {
                    price -= price * 0.15;
                }
                break;
            case "Narcissus":
                price = flowersCount * priceNarcissus;
                if (flowersCount < 120) {
                    price += price * 0.15;
                }
                break;
            case "Gladiolus":
                price = flowersCount * priceGladiolus;
                if (flowersCount < 80) {
                    price += price * 0.20;
                }
                break;
            default:
                System.out.println("error");
                break;
        }

        if (budget >= price) {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", flowersCount, flowersType, budget - price);

        } else {
            System.out.printf("Not enough money, you need %.2f leva more.", price - budget);
        }
    }
}
