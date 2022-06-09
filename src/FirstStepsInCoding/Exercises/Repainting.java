package FirstStepsInCoding.Exercises;

import java.util.Scanner;

public class Repainting {
    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);

        int nylon = Integer.parseInt(user_input.nextLine());
        int paint = Integer.parseInt(user_input.nextLine());
        int paint_thinner = Integer.parseInt(user_input.nextLine());
        int work_time = Integer.parseInt(user_input.nextLine());

        double nylon_price = (nylon + 2) * 1.50;
        double paint_price = (paint + (paint * 10.00 / 100)) * 14.50;
        double paint_thinner_price = paint_thinner * 5;

        double total_price = nylon_price + paint_price + paint_thinner_price + 0.40;
        double work_time_price = (total_price * 30 / 100) * work_time;

        total_price = total_price + work_time_price;

        System.out.println(total_price);
    }
}
