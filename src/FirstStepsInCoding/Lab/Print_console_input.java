package FirstStepsInCoding.Lab;

import java.util.Scanner;

public class Print_console_input {
    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);
        String text_output = user_input.nextLine();
        System.out.println(text_output);
    }
}
