package lecture24_switch;

import java.util.Scanner;

public class CalculatorWithSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Number one: ");
        double numberOne = scanner.nextDouble();

        System.out.print("Number two: ");
        double numberTwo = scanner.nextDouble();

        System.out.print("Operator: ");
        char operator = scanner.next().charAt(0);

        switch (operator) {
            case '+':
                System.out.println(numberOne + numberTwo);
                break;
            case '-':
                System.out.println(numberOne - numberTwo);
                break;
            case '*':
                System.out.println(numberOne * numberTwo);
                break;
            case '/':
                if (numberTwo != 0) {
                    System.out.println(numberOne / numberTwo);
                }
                else {
                    System.out.println("Division by zero is not possible...");
                }
                break;
            default:
                System.out.println("This operator is not managed...");

                Math.sin(10);
        }
    }
}
