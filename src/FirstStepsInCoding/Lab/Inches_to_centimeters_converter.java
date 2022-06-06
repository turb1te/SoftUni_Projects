package FirstStepsInCoding.Lab;

import java.util.Scanner;

public class Inches_to_centimeters_converter {
    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);

        double inches = Double.parseDouble(user_input.nextLine());
        double centimeters = inches * 2.54;

        System.out.println(centimeters);
    }
}
