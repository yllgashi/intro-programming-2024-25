package lecture16_exercise;

import java.util.Scanner;

public class SumTwoNumbers {
    public static void main(String[] args) {
        System.out.println("Sum two numbers");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Number one: ");
        int numOne = scanner.nextInt();

        System.out.print("Number two: ");
        int numTwo = scanner.nextInt();

        int result = numOne + numTwo;

        System.out.println("Result: " + result);
    }
}
