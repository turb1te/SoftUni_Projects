package ConditionalStatements.Lab;

import java.util.Scanner;

public class Boolean_isBiggerOrEqual {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        int a = Integer.parseInt(userInput.nextLine());
        int b = Integer.parseInt(userInput.nextLine());

        boolean isBiggerOrEqual = a >= b;

        System.out.println(isBiggerOrEqual);
    }
}
