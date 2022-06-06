package FirstStepsInCoding.Lab;

import java.util.Scanner;

public class GreetingsByName {
    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);
        String name = user_input.nextLine();
        System.out.println("Hello, " + name + "!");
    }
}
