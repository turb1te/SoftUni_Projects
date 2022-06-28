package ConditionalStatements.Lab;

import java.util.Scanner;

public class AreaOfFigures {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter the shape of the figure (only 'square', 'rectangle', 'circle' or 'triangle': ");
        String figureShape = userInput.nextLine();

        if (figureShape.equals("square")) {
            System.out.println("Enter the side of the square: ");
            double side = userInput.nextDouble();
            double area = side * side;
            System.out.printf("The area of the square is: %.3f", area);

        } else if (figureShape.equals("rectangle")) {
            System.out.println("Enter the length of the rectangle: ");
            double length = userInput.nextDouble();
            System.out.println("Enter the width of the rectangle: ");
            double width = userInput.nextDouble();
            double area = length * width;
            System.out.printf("The area of the rectangle is: %.3f", area);

        } else if (figureShape.equals("circle")) {
            System.out.println("Enter the radius of the circle: ");
            double radius = userInput.nextDouble();
            double area = Math.PI * radius * radius;
            System.out.printf("The area of the circle is: %.3f", area);

        } else if (figureShape.equals("triangle")) {
            System.out.println("Enter the base of the triangle: ");
            double base = userInput.nextDouble();
            System.out.println("Enter the height of the triangle: ");
            double height = userInput.nextDouble();
            double area = base * height / 2;
            System.out.printf("The area of the triangle is: %.3f", area);

        } else {
            System.out.println("Invalid input!");
        }
    }
}
