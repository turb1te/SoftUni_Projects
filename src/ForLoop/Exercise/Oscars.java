package ForLoop.Exercise;

import java.util.Scanner;

public class Oscars {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        String nameActor = userInput.nextLine();
        double pointsAcademy = Double.parseDouble(userInput.nextLine());
        int n = Integer.parseInt(userInput.nextLine());

        double pointsActor = pointsAcademy;

        for (int i = 1; i <= n; i++) {
            String nameAppraiser = userInput.nextLine();
            double pointsAppraiser = Double.parseDouble(userInput.nextLine());

            pointsActor += (nameAppraiser.length() * pointsAppraiser) / 2;

            if (pointsActor > 1250.5) {
                System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", nameActor, pointsActor);
                break;
            }
        }

        if (pointsActor <= 1250.5) {
            System.out.printf("Sorry, %s you need %.1f more!", nameActor, 1250.5 - pointsActor);
        }

    }
}
