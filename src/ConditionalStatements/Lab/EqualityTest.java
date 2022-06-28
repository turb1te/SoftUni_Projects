package ConditionalStatements.Lab;

import java.util.Scanner;

public class EqualityTest {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        String a = userInput.nextLine(); // We input "Martin" and expect return to be *false* because the strings have different addresses in memory because of scanner.
        //String a = "Martin"; // We expect return to be *true* because the "a" and "b" strings share the same memory address.
        String b = "Martin";

        System.out.println(a == b); // The correct way to compare strings is to use equals() method not == operator.
    }
}
