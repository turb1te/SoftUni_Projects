package ForLoop.Exercise;

import java.util.Scanner;

public class TennisRanklist {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        int numberOfTournaments = Integer.parseInt(userInput.nextLine());
        int initialPoints = Integer.parseInt(userInput.nextLine());

        int totalPoints = initialPoints;
        int numberOfWins = 0;
        int numberOfFinals = 0;
        int numberOfSemiFinals = 0;

        for (int i = 1; i <= numberOfTournaments; i++) {
            String tournamentResult = userInput.nextLine();
            switch (tournamentResult) {
                case "W":
                    totalPoints += 2000;
                    numberOfWins++;
                    break;
                case "F":
                    totalPoints += 1200;
                    numberOfFinals++;
                    break;
                case "SF":
                    totalPoints += 720;
                    numberOfSemiFinals++;
                    break;
            }
        }

        int averagePoints = (totalPoints - initialPoints) / numberOfTournaments;
        double winPercentage = numberOfWins * 1.00 / numberOfTournaments * 100;

        System.out.printf("Final points: %d\n", totalPoints);
        System.out.printf("Average points: %.0f\n", Math.floor(averagePoints));
        System.out.printf("%.2f%%\n", winPercentage);

    }
}
