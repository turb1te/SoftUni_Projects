package FirstStepsInCoding.Exercises;

import java.util.Scanner;

public class DepositCalculator {
    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);

        double deposit = Double.parseDouble(user_input.nextLine());
        int term = Integer.parseInt(user_input.nextLine());
        double apr = Double.parseDouble(user_input.nextLine());
        double final_amount = deposit + term * ((deposit * apr / 100) / 12);

        System.out.println(final_amount);
    }
}
