package FirstStepsInCoding.Lab;

import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);

        int dogPackets = Integer.parseInt(user_input.nextLine());
        int catPackets = Integer.parseInt(user_input.nextLine());
        double dogMoney = dogPackets * 2.50;
        double catMoney = catPackets * 4;
        double expenses = dogMoney + catMoney;

        System.out.printf("%.2f lv.", expenses);
    }
}
