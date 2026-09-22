package Lab01.Homework;

import java.util.Scanner;

public class TriangleConstructor {
    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter height n: ");
        String strN = keyboard.nextLine();

        int n = Integer.parseInt(strN);

        for (int i = 0; i < n; i++) {
            String spaces = " ".repeat(n - i - 1);
            String stars = "*".repeat(2 * i + 1);
            System.out.println(spaces + stars);
        }

        keyboard.close();
    }
}
