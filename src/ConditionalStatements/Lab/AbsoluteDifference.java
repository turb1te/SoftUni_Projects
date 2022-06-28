package ConditionalStatements.Lab;

import java.util.Scanner;

public class AbsoluteDifference {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        int num1 = Integer.parseInt(userInput.nextLine());
        int num2 = Integer.parseInt(userInput.nextLine());

        System.out.println(Math.abs(num1 - num2));
        /*
        Finding the absolute difference between two numbers.
        For example: if the numbers are 5 and -3, the absolute difference is 8.
        */
    }
}
