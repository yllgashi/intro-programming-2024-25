package lecture42_arrays_multidimensional;

public class MatrixExample {
    public static void main(String[] args) {
        // create array with 5 rows and 3 columns
        int[][] matrix = new int[2][3]; // 15 int variables

        // row = 0, column 0
        matrix[0][0] = 1;

        // row = 0, column 1
        matrix[0][1] = 2;

        // row = 0, column 2
        matrix[0][2] = 2;


        // row = 1, column 0
        matrix[1][0] = 4;

        // row = 1, column 1
        matrix[1][1] = 5;

        // row = 1, column 2
        matrix[1][2] = 6;

        // show information
        System.out.println(matrix[0][0]); // row 0, column 0
        System.out.println(matrix[1][1]); // row 1, column 1
        System.out.println(matrix[1][2]); // row 1, column 2
    }
}
