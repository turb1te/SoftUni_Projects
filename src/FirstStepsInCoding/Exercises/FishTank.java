package FirstStepsInCoding.Exercises;

import java.util.Scanner;

public class FishTank {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        int length = Integer.parseInt(userInput.nextLine());
        int width = Integer.parseInt(userInput.nextLine());
        int height = Integer.parseInt(userInput.nextLine());
        double percentage = Double.parseDouble(userInput.nextLine());

        double volume = length * width * height;
        double water = volume / 1000;
        double waterNeeded = water * (1 - percentage / 100);

        System.out.println(waterNeeded);
    }
}
