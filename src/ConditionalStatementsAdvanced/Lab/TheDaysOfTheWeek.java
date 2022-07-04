package ConditionalStatementsAdvanced.Lab;

import java.util.Scanner;

public class TheDaysOfTheWeek {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        String day = userInput.nextLine();

        switch (day) {
            case "Monday":
                System.out.printf("Today is %s!", day);
                break;
            case "Tuesday":
                System.out.printf("Today is %s!", day);
                break;
            case "Wednesday":
                System.out.printf("Today is %s!", day);
                break;
            case "Thursday":
                System.out.printf("Today is %s!", day);
                break;
            case "Friday":
                System.out.printf("Today is %s!", day);
                break;
            case "Saturday":
                System.out.printf("Today is %s!", day);
                break;
            case "Sunday":
                System.out.printf("Today is %s!", day);
                break;
            default:
                System.out.println("Invalid day!");
                break;
        }
    }
}
