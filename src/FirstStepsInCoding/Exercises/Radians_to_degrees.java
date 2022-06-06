package FirstStepsInCoding.Exercises;

import java.util.Scanner;

public class Radians_to_degrees {
    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);

        double radians = Double.parseDouble(user_input.nextLine());
        double degrees = radians * 180 / Math.PI;

        System.out.println(degrees);
    }
}
