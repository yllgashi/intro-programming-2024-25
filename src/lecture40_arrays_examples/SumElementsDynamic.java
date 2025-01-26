package lecture40_arrays_examples;

import java.util.Scanner;

public class SumElementsDynamic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Write how many numbers you want to sum: ");
        int totalNumbers = scanner.nextInt();

        int[] numbers = new int[totalNumbers];


        // initialize each number
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Number: ");
            numbers[i] = scanner.nextInt();
        }

        // show sum of numbers
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        System.out.println("Total sum is: " + sum);
    }
}
