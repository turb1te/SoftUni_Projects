package ForLoop.Lab;

import java.util.Scanner;

public class Numbers_N_to_1 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        int n = Integer.parseInt(userInput.nextLine());

        for (int i = n; i >= 1; i--) {
            System.out.println(i);
        }
    }
}
