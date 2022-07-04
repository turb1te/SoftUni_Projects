package ConditionalStatements.Exercises;

import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        double budget = Double.parseDouble(userInput.nextLine());
        int gpus = Integer.parseInt(userInput.nextLine());
        int cpus = Integer.parseInt(userInput.nextLine());
        int ram_sticks = Integer.parseInt(userInput.nextLine());

        double gpu_price = gpus * 250;
        double cpu_price = cpus * (gpu_price * 0.35);
        double ram_price = ram_sticks * (gpu_price * 0.10);

        double totalPrice = gpu_price + cpu_price + ram_price;

        if (gpus > cpus) {
            totalPrice -= totalPrice * 0.15;
        }

        if (budget >= totalPrice) {
            System.out.printf("You have %.2f leva left!", budget - totalPrice);
        } else {
            System.out.printf("Not enough money! You need %.2f leva more!", totalPrice - budget);
        }
    }
}
