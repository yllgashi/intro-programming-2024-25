package lecture42_arrays_multidimensional;

import java.util.Scanner;

public class InitializeMatrixDynamically {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Write rows: ");
        int rows = scanner.nextInt();

        System.out.print("Write columns");
        int columns = scanner.nextInt();

        int[][] matrix = new int[rows][columns];


        int number = 0;
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[0].length; c++) {
                matrix[r][c] = number;
                number++;
            }
        }

        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[0].length; c++) {
                System.out.print(matrix[r][c] + " ");
            }
            System.out.println();
        }
    }
}
