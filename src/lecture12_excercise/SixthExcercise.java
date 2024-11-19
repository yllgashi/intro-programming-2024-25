package lecture12_excercise;

import java.util.Scanner;

public class SixthExcercise {
    public static void main(String[] args) {
        // Write application description
        System.out.println("Generate force if mass and gravity is provided from user");

        // Create scanner (which wil provide for us tools to get inputs from user)
        Scanner scanner = new Scanner(System.in);

        // Get mass from user
        System.out.print("Write mass: ");
        double m = scanner.nextDouble();

        // Gravity its always 9.8 in earth
        final double g = 9.8;

        // calculate result based on given formula F=m*g
        double f = m * g;

        // Print the result
        System.out.println("Result: " + f);
    }
}
