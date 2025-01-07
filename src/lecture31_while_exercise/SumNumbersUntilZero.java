package lecture31_while_exercise;

import java.util.Scanner;

public class SumNumbersUntilZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int number = -100; // default value

        // sum numbers until user did not give value "0" as input

        // number => SENTINEL (you can find with this name in books)
        while (number != 0) {
            System.out.print("Write number: ");
            number = scanner.nextInt();
            sum += number;
        }

        System.out.println("Total sum is: " + sum);
    }
}
