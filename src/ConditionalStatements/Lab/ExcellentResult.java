package ConditionalStatements.Lab;

import java.util.Scanner;

public class ExcellentResult {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        int Grade = Integer.parseInt(userInput.nextLine());

        if (Grade >= 5) {
            System.out.println("Excellent!");
        }
    }
}
