package ConditionalStatementsAdvanced.Lab;

import java.util.Scanner;

public class NumberInRange {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        int number = Integer.parseInt(userInput.nextLine());

        // In range [-100, 100] and different from 0
        if (number >= -100 && number <= 100 && number != 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
