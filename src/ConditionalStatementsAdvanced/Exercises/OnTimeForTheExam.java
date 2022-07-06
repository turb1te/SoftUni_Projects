package ConditionalStatementsAdvanced.Exercises;

import java.util.Scanner;

public class OnTimeForTheExam {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        int examHour = Integer.parseInt(userInput.nextLine());
        int examMinute = Integer.parseInt(userInput.nextLine());
        int arrivalHour = Integer.parseInt(userInput.nextLine());
        int arrivalMinute = Integer.parseInt(userInput.nextLine());

        int examTime = (examHour * 60) + examMinute;
        int arrivalTime = (arrivalHour * 60) + arrivalMinute;

        int timeDiff = Math.abs(arrivalTime - examTime);

        int diffHour = timeDiff / 60;
        int diffMinute = timeDiff % 60;

        if (examTime < arrivalTime) {
            System.out.println("Late");
            if (diffHour == 0) {
                System.out.printf("%d minutes after the start", diffMinute);
            } else {
                System.out.printf("%d:%02d hours after the start", diffHour, diffMinute);
            }
        } else if (arrivalTime == examTime || timeDiff <= 30) {
            System.out.println("On time");
            if (timeDiff != 0) {
                System.out.printf("%d minutes before the start", diffMinute);
            }
        } else {
            System.out.println("Early");
            if (diffHour == 0) {
                System.out.printf("%d minutes before the start", diffMinute);
            } else {
                System.out.printf("%d:%02d hours before the start", diffHour, diffMinute);
            }
        }
    }
}
