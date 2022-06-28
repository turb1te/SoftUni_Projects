package ConditionalStatements.Lab;

import java.util.Scanner;

public class FoodColor {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter a color (only red, green or blue): ");

        String color = userInput.nextLine();

        if (color.equals("red")) {
            System.out.println("Tomato is red!");
        } else if (color.equals("green")) {
            System.out.println("Cucumber is green!");
        } else if (color.equals("blue")) {
            System.out.println("Blueberry is blue!");
        } else {
            System.out.println("Invalid color!");
        }

        System.out.println("Goodbye!");
    }
}
