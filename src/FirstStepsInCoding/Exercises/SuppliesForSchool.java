package FirstStepsInCoding.Exercises;

import java.util.Scanner;

public class SuppliesForSchool {
    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);

        int pens = Integer.parseInt(user_input.nextLine());
        int markers = Integer.parseInt(user_input.nextLine());
        int cleaner = Integer.parseInt(user_input.nextLine());
        int discount = Integer.parseInt(user_input.nextLine());

        double pens_price = pens * 5.80;
        double markers_price = markers * 7.20;
        double cleaner_price = cleaner * 1.20;

        double total_price = pens_price + markers_price + cleaner_price;
        double total_price_w_discount = total_price - (total_price * discount / 100);

        System.out.println(total_price_w_discount);
    }
}
