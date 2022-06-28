package ConditionalStatements.Lab;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        int number = Integer.parseInt(userInput.nextLine());

        if (number % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }
}
