package lecture12_excercise;

import java.util.Scanner;

public class SeventhExcercise {
    public static void main(String[] args) {
        // S = 1/2 * a * h

        System.out.println("This application will calculate triangle syprine");

        Scanner scanner = new Scanner(System.in);

        System.out.print("a: ");
        double a = scanner.nextDouble();

        System.out.print("h: ");
        double h = scanner.nextDouble();

        // calculate S = 1/2 * a * h
        double syprine = 1.00/2 * a * h;

        // show result
        System.out.println("Result: " + syprine);
    }
}
