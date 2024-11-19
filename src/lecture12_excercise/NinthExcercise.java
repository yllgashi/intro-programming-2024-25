package lecture12_excercise;

import java.util.Scanner;

public class NinthExcercise {
    public static void main(String[] args) {
        System.out.println("Welcome to calculator...");

        Scanner scanner = new Scanner(System.in);

        System.out.print("First number: ");
        double a = scanner.nextDouble();

        System.out.print("Second number: ");
        double b = scanner.nextDouble();


        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);
    }
}










