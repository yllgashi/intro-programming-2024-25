package lecture42_arrays_multidimensional;

public class MatrixExampleTwo {
    public static void main(String[] args) {
        int[][] matrix = new int[2][3];

        matrix = fillElementsInMatrix(matrix);

        printElementsOfMatrix(matrix);

    }

    public static int[][] fillElementsInMatrix(int[][] matrix) {
        int number = 0;
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[1].length; col++) {
                number++;
                matrix[row][col] = number;
            }
        }

        return matrix;
    }

    public static void printElementsOfMatrix(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[1].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }
}
