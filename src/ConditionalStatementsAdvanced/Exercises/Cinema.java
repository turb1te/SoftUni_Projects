package ConditionalStatementsAdvanced.Exercises;

import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        String projectionType = userInput.nextLine();
        int rows = Integer.parseInt(userInput.nextLine());
        int columns = Integer.parseInt(userInput.nextLine());

        int totalTickets = rows * columns;

        double totalIncome = 0;

        switch (projectionType) {
            case "Premiere":
                totalIncome = totalTickets * 12.00;
                break;
            case "Normal":
                totalIncome = totalTickets * 7.50;
                break;
            case "Discount":
                totalIncome = totalTickets * 5.00;
                break;
        }

        if (totalIncome == 0) {
            System.out.println("error");
        } else {
            System.out.printf("%.2f leva", totalIncome);
        }
    }
}
