package FirstStepsInCoding.Lab;

import java.util.Scanner;

public class Print_name_and_age {
    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);
        String first_name = user_input.nextLine();
        String last_name = user_input.nextLine();
        int age = Integer.parseInt(user_input.nextLine());
        System.out.printf("You are %s %s, a %d-years old person.", first_name, last_name, age);
        // You are Martin Kirekchiev, a 20-years old person.
    }
}
