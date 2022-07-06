package ForLoop.Lab;

import java.util.Scanner;

public class CharacterSequence {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        String input = userInput.nextLine();

        for (int i = 0; i < input.length(); i++) {
            char character = input.charAt(i);
            System.out.println(character);
        }
    }
}
