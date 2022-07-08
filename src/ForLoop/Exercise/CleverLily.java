package ForLoop.Exercise;

import java.util.Scanner;

public class CleverLily {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        int age = Integer.parseInt(userInput.nextLine());
        double washerPrice = Double.parseDouble(userInput.nextLine());
        int toyPrice = Integer.parseInt(userInput.nextLine());

        int toys = 0;
        double birthdayMoney = 0;
        int brotherMoney = 0;

        for (int i = 1; i <= age; i++) {
            if (i % 2 == 0) {
                birthdayMoney += 10.00 * i / 2;
                brotherMoney++;
            } else {
                toys++;
            }
        }

        double toysPrice = toys * toyPrice;
        double totalMoney = toysPrice + birthdayMoney - brotherMoney;

        if (totalMoney >= washerPrice) {
            System.out.printf("Yes! %.2f", totalMoney - washerPrice);
        } else {
            System.out.printf("No! %.2f", washerPrice - totalMoney);
        }

    }
}
