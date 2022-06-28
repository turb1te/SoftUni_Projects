package ConditionalStatements.Lab;

import java.util.Scanner;

public class Bill_Payment {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        int Wallet = Integer.parseInt(userInput.nextLine());
        int Bill = Integer.parseInt(userInput.nextLine());

        if (Wallet >= Bill) {
            System.out.println("I will pay in cash!");
        } else {
            System.out.println("I will pay by credit card!");
        }
    }
}
