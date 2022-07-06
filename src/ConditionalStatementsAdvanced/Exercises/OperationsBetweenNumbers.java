package ConditionalStatementsAdvanced.Exercises;

import java.util.Scanner;

public class OperationsBetweenNumbers {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        int n1 = Integer.parseInt(userInput.nextLine());
        int n2 = Integer.parseInt(userInput.nextLine());
        char operator = userInput.nextLine().charAt(0);

        switch (operator) {
            case '+':
                System.out.printf("%d + %d = %d - %s", n1, n2, n1 + n2, (n1 + n2) % 2 == 0 ? "even" : "odd");
                break;
            case '-':
                System.out.printf("%d - %d = %d - %s", n1, n2, n1 - n2, (n1 - n2) % 2 == 0 ? "even" : "odd");
                break;
            case '*':
                System.out.printf("%d * %d = %d - %s", n1, n2, n1 * n2, (n1 * n2) % 2 == 0 ? "even" : "odd");
                break;
            case '/':
                if (n2 == 0) {
                    System.out.printf("Cannot divide %d by zero", n1);
                } else {
                    double num1 = n1;
                    double num2 = n2;
                    System.out.printf("%d / %d = %.2f", n1, n2, num1 / num2);
                }
                break;
            case '%':
                if (n2 == 0) {
                    System.out.printf("Cannot divide %d by zero", n1);
                } else {
                    System.out.printf("%d %% %d = %d", n1, n2, n1 % n2);
                }
                break;
        }
    }
}
