package lecture28_nested_for;

import java.util.Scanner;

public class NestedForExerciseTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many rows: ");
        int totalRows = scanner.nextInt();

        System.out.print("How many columns: ");
        int totalColumns = scanner.nextInt();


        for (int row = 1; row <= totalRows; row++) {
            for (int column = 1; column <= totalColumns; column++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
