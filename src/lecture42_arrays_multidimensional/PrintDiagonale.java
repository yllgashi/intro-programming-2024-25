package lecture42_arrays_multidimensional;

public class PrintDiagonale {
    public static void main(String[] args) {
        int[][] matrix = new int[5][5];


        int number = 0;
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[0].length; c++) {
                matrix[r][c] = number;
                number++;
            }
        }


        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[0].length; c++) {
                if (r == c) {
                    System.out.println(matrix[r][c]);
                }
            }

        }
    }
}
