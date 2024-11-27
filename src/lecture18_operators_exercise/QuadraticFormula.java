package lecture18_operators_exercise;

import java.util.Scanner;

public class QuadraticFormula {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double b = scanner.nextDouble();
        double c = scanner.nextDouble();


        double d = Math.sqrt(Math.pow(b, 2) - 4 * c);

        double x1 = (-b + d) / 2;
        double x2 = (-b - d) / 2;

        System.out.println(x1);
        System.out.println(x2);
    }
}
