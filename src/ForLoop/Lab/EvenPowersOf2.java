package ForLoop.Lab;

import java.util.Scanner;

public class EvenPowersOf2 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        int n = userInput.nextInt();

        for (int i = 0; i <= n; i += 2) {
            System.out.printf("%.0f\n", Math.pow(2, i));
        }
    }
}
