package ConditionalStatements.Lab;

import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int a = Integer.parseInt(userInput.nextLine());
        int b = 10;

        System.out.println(a >= b);
        System.out.println(a <= b);
        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a == b);
        System.out.println(a != b);
    }
}
