package FirstStepsInCoding.Exercises;

import java.util.Scanner;

public class BasketballEquipment {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        int yearPrice = Integer.parseInt(userInput.nextLine());

        double basketballSneakers = yearPrice * 0.60;
        double basketballOutfit = basketballSneakers * 0.80;
        double basketballBall = basketballOutfit * 0.25;
        double basketballAccessories = basketballBall * 0.20;

        System.out.println(yearPrice + basketballSneakers + basketballOutfit + basketballBall + basketballAccessories);
    }
}
