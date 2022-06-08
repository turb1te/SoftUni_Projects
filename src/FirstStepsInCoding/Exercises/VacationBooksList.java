package FirstStepsInCoding.Exercises;

import java.util.Scanner;

public class VacationBooksList {
    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);

        int pages = Integer.parseInt(user_input.nextLine());
        int pages_per_h = Integer.parseInt(user_input.nextLine());
        int deadline = Integer.parseInt(user_input.nextLine());

        int h_to_read = pages / pages_per_h;
        int h_per_day = h_to_read / deadline;

        System.out.println(h_per_day);
    }
}
