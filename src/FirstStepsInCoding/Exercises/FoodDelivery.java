package FirstStepsInCoding.Exercises;

import java.util.Scanner;

public class FoodDelivery {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        int chickenMenu = Integer.parseInt(userInput.nextLine());
        int fishMenu = Integer.parseInt(userInput.nextLine());
        int vegetarianMenu = Integer.parseInt(userInput.nextLine());

        double chickenPrice = chickenMenu * 10.35;
        double fishPrice = fishMenu * 12.40;
        double vegetarianPrice = vegetarianMenu * 8.15;

        double totalPrice = chickenPrice + fishPrice + vegetarianPrice;
        double dessertPrice = totalPrice * 0.20;
        double totalPriceWithDelivery = totalPrice + dessertPrice + 2.50;

        System.out.println(totalPriceWithDelivery);

    }
}
