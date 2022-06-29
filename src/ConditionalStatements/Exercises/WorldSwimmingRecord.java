package ConditionalStatements.Exercises;

import java.util.Scanner;

public class WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        double worldRecord = Double.parseDouble(userInput.nextLine());
        double distance = Double.parseDouble(userInput.nextLine());
        double speed = Double.parseDouble(userInput.nextLine());

        double timeToSwim = distance * speed;
        double timeResistance = Math.floor(distance / 15) * 12.5;
        timeToSwim = timeToSwim + timeResistance;

        if (timeToSwim < worldRecord) {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", timeToSwim);
        } else {
            System.out.printf("No, he failed! He was %.2f seconds slower.", timeToSwim - worldRecord);
        }
    }
}
