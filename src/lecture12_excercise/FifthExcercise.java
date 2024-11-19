package lecture12_excercise;

import java.util.Scanner;

public class FifthExcercise {
    public static void main(String[] args) {
        System.out.println("Welcome to second Newton's law");
        System.out.println("In this application you provide mass and acceleration and application will generate force");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Mass: ");
        double m = scanner.nextDouble();

        System.out.print("Acceleration: ");
        double a = scanner.nextDouble();


        double f = m * a;

        System.out.println("Force is: " + f);
    }
}
