package FirstStepsInCoding.Exercises;

import java.util.Scanner;

public class USD_to_BGN {
    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);

        double usd = Double.parseDouble(user_input.nextLine());
        double bgn = usd * 1.79549;

        System.out.printf("%.2f USD is equivalent to %.2f BGN!", usd, bgn);
    }
}
