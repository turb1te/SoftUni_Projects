package FirstStepsInCoding.Lab;

import java.util.Scanner;

public class Print_name_and_age {
    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);
        String first_name = user_input.nextLine();
        String last_name = user_input.nextLine();
        String age = user_input.nextLine();
        System.out.println("Her/his name is: " + first_name + " " + last_name + " @ " + age);
        // Her/his name is: Martin Kirekchiev @ 20
    }
}
