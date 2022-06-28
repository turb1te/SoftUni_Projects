package ConditionalStatements.Lab;

import java.util.Scanner;

public class PasswordGuess {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        String PasswordInput = userInput.nextLine();
        String CorrectPassword = "s3cr3t!P@ssw0rd";

        if (PasswordInput.equals(CorrectPassword)) {
            System.out.println("Welcome");
        } else {
            System.out.println("Wrong password!");
        }
    }
}
