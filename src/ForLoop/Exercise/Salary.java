package ForLoop.Exercise;

import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        int openTabs = Integer.parseInt(userInput.nextLine());
        int salary = Integer.parseInt(userInput.nextLine());

        for (int i = 1; i <= openTabs; i++) {
            String currentTab = userInput.nextLine();
            switch (currentTab) {
                case "Facebook":
                    salary -= 150;
                    break;
                case "Instagram":
                    salary -= 100;
                    break;
                case "Reddit":
                    salary -= 50;
                    break;
            }
            if (salary <= 0) {
                System.out.println("You have lost your salary.");
                break;
            }
        }

        if (salary > 0) {
            System.out.println(salary);
        }

    }
}
