package ConditionalStatementsAdvanced.Lab;

import java.util.Scanner;

public class WorkingHours {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        int hour = Integer.parseInt(userInput.nextLine());
        String day = userInput.next();

        if ((hour >= 10 && hour <= 18) && ((day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday") || day.equals("Thursday") || day.equals("Friday") || day.equals("Saturday")))) {
            System.out.println("open");
        } else {
            System.out.println("closed");
        }
    }
}
