package FirstStepsInCoding.Lab;

import java.util.Scanner;

public class GreetingsByName_2 {
    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);
        String name = user_input.nextLine();
        System.out.print("Hello, ");
        System.out.print(name);
        System.out.println("!");
    }
}
