package ForLoop.Lab;

import java.util.Scanner;

public class OddEvenSum {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        int n = Integer.parseInt(userInput.nextLine());

        int sum1 = 0;
        int sum2 = 0;

        for (int i = 1; i <= n; i++) {
            int number = Integer.parseInt(userInput.nextLine());
            if (i % 2 == 0) {
                sum1 += number;
            } else {
                sum2 += number;
            }
        }

        if (sum1 == sum2) {
            System.out.println("Yes");
            System.out.printf("Sum = %d%n", sum1);
        } else {
            System.out.println("No");
            System.out.printf("Diff = %d\n", Math.abs(sum1 - sum2));
        }
    }
}
