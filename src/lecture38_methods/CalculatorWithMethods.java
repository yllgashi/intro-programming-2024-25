package lecture38_methods;

import java.util.Scanner;

public class CalculatorWithMethods {
    public static void main(String[] args) {
        // Krijo nje kalkulator i cili do te realizoj mbledhjen dhe zbritjen e numrave
        // Dy numra do te jepen nga perdoruesi
        // Kalkulatori te perserit procesin perderisa perdoruesi nuk i shtyp fjalen "stop" tek operatori

        Scanner scanner = new Scanner(System.in);

        String operator = "";

        while (!operator.equals("stop")) {
            System.out.print("Number one: ");
            int numOne = scanner.nextInt();

            System.out.print("Number two: ");
            int numTwo = scanner.nextInt();

            System.out.print("Operator");
            operator = scanner.nextLine();

            switch (operator) {
                case "+":
                    int resultSum = sum(numOne, numTwo);
                    System.out.println("Result: " + resultSum);
                    break;
                case "-":
                    int resultSub = sub(numOne, numTwo);
                    System.out.println("Result: " + resultSub);
                default:
                    System.out.println("Try again");
            }
        }
    }


    public static int sum(int x, int y) {
        int result = x + y;
        return result;
    }

    public static int sub(int x, int y) {
        int result = x - y;
        return result;
    }
}
