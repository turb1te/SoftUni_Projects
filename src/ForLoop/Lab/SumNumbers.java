package ForLoop.Lab;

import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        int n = Integer.parseInt(userInput.nextLine());

        int sum = 0;

        for (int i = 1; i <= n; i++) {
            int number = Integer.parseInt(userInput.nextLine());
            sum += number;
        }
        System.out.println(sum);
    }
}
