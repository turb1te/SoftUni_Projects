package ConditionalStatements.Lab;

import java.util.Scanner;

public class RoundingExamples {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        double num = Double.parseDouble(userInput.nextLine());

        double up = Math.ceil(num);
        double down = Math.floor(num);
        double round = Math.round(num);

        System.out.printf("%.2f%n", up);
        System.out.printf("%.2f%n", down);
        System.out.printf("%.2f%n", round);
    }
}
