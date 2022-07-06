package ForLoop.Lab;

import java.util.Scanner;

public class LeftAndRightSum {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
// Да се напише програма, която чете 2 * n-на брой цели числа, подадени от потребителя, и проверява дали сумата на първите n числа (лява сума) е равна на сумата на вторите n числа (дясна сума). При равенство печата " Yes, sum = " + сумата; иначе печата " No, diff = " + разликата. Разликата се изчислява като положително число (по абсолютна стойност).

        int n = Integer.parseInt(userInput.nextLine());

        int sum1 = 0;
        int sum2 = 0;

        for (int i = 1; i <= n; i++) {
            int number = Integer.parseInt(userInput.nextLine());
            sum1 += number;
        }

        for (int i = 1; i <= n; i++) {
            int number = Integer.parseInt(userInput.nextLine());
            sum2 += number;
        }

        if (sum1 == sum2) {
            System.out.printf("Yes, sum = %d%n", sum1);
        } else {
            System.out.printf("No, diff = %d\n", Math.abs(sum1 - sum2));
        }
    }
}
