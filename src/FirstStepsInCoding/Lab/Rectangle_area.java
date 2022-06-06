package FirstStepsInCoding.Lab;

import java.util.Scanner;

public class Rectangle_area {
    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);

        int a = Integer.parseInt(user_input.nextLine());
        int b = Integer.parseInt(user_input.nextLine());
        int area = a * b;

        System.out.println(area);
    }
}
