package FirstStepsInCoding.Lab;

import java.util.Scanner;

public class ProjectsCreation {
    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);

        String name = user_input.nextLine();
        int projectCount = Integer.parseInt(user_input.nextLine());
        int neededTime = projectCount * 3;

        System.out.printf("The architect %s will need %d hours to complete %d project/s.", name, neededTime, projectCount);
    }
}
