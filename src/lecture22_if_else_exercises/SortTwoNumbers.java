package lecture22_if_else_exercises;

import java.util.Scanner;

public class SortTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Number one: ");
        int numberOne = scanner.nextInt();

        System.out.print("Number two: ");
        int numberTwo = scanner.nextInt();


        // option 1 (we are repeating too much code):
        if(numberOne < numberTwo) {
            System.out.println();
            System.out.println("Sorted numbers are...");
            System.out.println(numberOne);
            System.out.println(numberTwo);
        }
        else {
            System.out.println();
            System.out.println("Sorted numbers are...");
            System.out.println(numberTwo);
            System.out.println(numberOne);
        }


        // option 2:
        if(numberTwo < numberOne) {
            int temporary = numberOne;
            numberOne = numberTwo;
            numberTwo = temporary;
        }

        System.out.println();
        System.out.println("Sorted numbers are...");
        System.out.println(numberOne);
        System.out.println(numberTwo);
    }


}
