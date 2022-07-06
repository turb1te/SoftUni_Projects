package ForLoop.Lab;

import java.util.Scanner;

public class Numbers_1toN_with_Step_3 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        int n = Integer.parseInt(userInput.nextLine());

        for (int i = 1; i <= n; i += 3) {
            System.out.println(i);
        }
    }
}
