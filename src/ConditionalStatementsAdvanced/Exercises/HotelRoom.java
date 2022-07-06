package ConditionalStatementsAdvanced.Exercises;

import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        String month = userInput.nextLine(); // May, June, July, August, September or October
        int nights = Integer.parseInt(userInput.nextLine());

        double appartmentDiscount = 0;
        double studioDiscount = 0;

        double appartmentPrice = 0;
        double studioPrice = 0;

        switch (month) {
            case "May":
            case "October":
                studioPrice = 50.00;
                appartmentPrice = 65.00;
                if (nights > 7 && nights <= 14) {
                    studioDiscount = 0.05;
                } else if (nights > 14) {
                    studioDiscount = 0.30;
                    appartmentDiscount = 0.10;
                }
                studioPrice = studioPrice - (studioPrice * studioDiscount);
                appartmentPrice = appartmentPrice - (appartmentPrice * appartmentDiscount);
                break;
            case "June":
            case "September":
                studioPrice = 75.20;
                appartmentPrice = 68.70;
                if (nights > 14) {
                    studioDiscount = 0.20;
                    appartmentDiscount = 0.10;
                }
                studioPrice = studioPrice - (studioPrice * studioDiscount);
                appartmentPrice = appartmentPrice - (appartmentPrice * appartmentDiscount);
                break;
            case "July":
            case "August":
                studioPrice = 76.00;
                appartmentPrice = 77.00;
                if (nights > 14) {
                    appartmentDiscount = 0.10;
                }
                studioPrice = studioPrice - (studioPrice * studioDiscount);
                appartmentPrice = appartmentPrice - (appartmentPrice * appartmentDiscount);
                break;
        }
        System.out.printf("Apartment: %.2f lv.%n", appartmentPrice * nights);
        System.out.printf("Studio: %.2f lv.", studioPrice * nights);
    }
}
