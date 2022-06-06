package FirstStepsInCoding.Lab;

import java.util.Scanner;

public class YardGreening {
    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);

        double area = Double.parseDouble(user_input.nextLine());
        double price = area * 7.61;
        double price_with_discount = price * 0.82;
        double discount = price * 0.18;

        System.out.printf("The final price is: %.2f lv.%n", price_with_discount);
        System.out.printf("The discount is: %.2f lv.", discount);
    }
}
