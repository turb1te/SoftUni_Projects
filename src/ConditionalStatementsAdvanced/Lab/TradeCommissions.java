package ConditionalStatementsAdvanced.Lab;

import java.util.Scanner;

public class TradeCommissions {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        String town = userInput.nextLine();
        double sales = Double.parseDouble(userInput.nextLine());

        double percentage = 0;

        switch (town) {
            case "Sofia":
                if (sales >= 0 && sales <= 500) {
                    percentage = 0.05;
                } else if (sales > 500 && sales <= 1000) {
                    percentage = 0.07;
                } else if (sales > 1000 && sales <= 10000) {
                    percentage = 0.08;
                } else if (sales > 10000) {
                    percentage = 0.12;
                } else {
                    percentage = 0;
                }
                break;
            case "Varna":
                if (sales >= 0 && sales <= 500) {
                    percentage = 0.045;
                } else if (sales > 500 && sales <= 1000) {
                    percentage = 0.075;
                } else if (sales > 1000 && sales <= 10000) {
                    percentage = 0.10;
                } else if (sales > 10000) {
                    percentage = 0.13;
                } else {
                    percentage = 0;
                }
                break;
            case "Plovdiv":
                if (sales >= 0 && sales <= 500) {
                    percentage = 0.055;
                } else if (sales > 500 && sales <= 1000) {
                    percentage = 0.08;
                } else if (sales > 1000 && sales <= 10000) {
                    percentage = 0.12;
                } else if (sales > 10000) {
                    percentage = 0.145;
                } else {
                    percentage = 0;
                }
                break;
        }

        if (percentage == 0) {
            System.out.println("error");
        } else {
            System.out.printf("%.2f", percentage * sales);
        }

    }
}
