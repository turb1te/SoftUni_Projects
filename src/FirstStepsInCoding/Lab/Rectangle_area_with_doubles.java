package FirstStepsInCoding.Lab;

import java.util.Scanner;

public class Rectangle_area_with_doubles {
    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);

        double a = Double.parseDouble(user_input.nextLine());
        double b = Double.parseDouble(user_input.nextLine());
        double area = a * b;

        System.out.println(area);
    }
}
