package ConditionalStatements.Lab;

import java.util.Scanner;

public class LessBetweenGreater {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        int num = Integer.parseInt(userInput.nextLine());

        if (num < 100) {
            System.out.println("Less than 100");
        } else if (num <= 200) {
            System.out.println("Between 100 and 200");
        } else {
            System.out.println("Greater than 200");
        }
    }
}
