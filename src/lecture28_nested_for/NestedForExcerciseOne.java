package lecture28_nested_for;

public class NestedForExcerciseOne {
    public static void main(String[] args) {
        // &
        // &&
        // &&&
        // &&&&
        // &&&&&

        // rows
        for (int row = 1; row <= 5; row++) {
            System.out.println("row " + row);
        }

        // rows with columns
        for (int row = 1; row <= 5; row++) {
            for (int column = 1; column <= 5; column++) {
                System.out.print("cell");
            }
            System.out.println();
        }


        System.out.println("##############################################");

        // exercise:
        for (int row = 1; row <= 5; row++) {
            for (int column = 1; column <= row; column++) {
                System.out.print("&");
            }
            System.out.println();
        }
    }
}
