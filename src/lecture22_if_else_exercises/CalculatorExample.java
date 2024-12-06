package lecture22_if_else_exercises;

import java.util.Scanner;

public class CalculatorExample {
    public static void main(String[] args) {
        // Te shkruhet program I cili pranon dy numra dhe operatorin (+,-,/,*,%)
        // dhe I cili varesisht nga operatori qe ka zgjedhur gjen rezultatin?
        // Te program me lart (2) te shtohet edhe validimi ne rast te pjestimit me zero?

        System.out.println("Welcome to calculator...");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Number one: ");
        double numberOne = scanner.nextDouble();

        System.out.print("Number two: ");
        double numberTwo = scanner.nextDouble();

        scanner.nextLine();
        System.out.print("Operator: ");
        String operator = scanner.nextLine();

        if(operator == "+") {
            System.out.println(numberOne + numberTwo);
        }
        else if(operator == "-") {
            System.out.println(numberOne - numberTwo);
        }
        else if (operator == "*") {
            System.out.println(numberOne * numberTwo);
        }
        else if (operator == "/") {
            if(numberTwo == 0) {
                System.out.println("Division by zero...");
            }
            else {
                System.out.println(numberOne / numberTwo);
            }
        }
        else if (operator == "%") {
            if(numberTwo == 0) {
                System.out.println("Division by zero...");
            }
            else {
                System.out.println(numberOne % numberTwo);
            }
        }
        else {
            System.out.println("Operator is not valid...");
        }
    }
}
