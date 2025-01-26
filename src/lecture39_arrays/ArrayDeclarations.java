package lecture39_arrays;

public class ArrayDeclarations {
    public static void main(String[] args) {
        // declaration and initialization (1)
        int[] userAges1 = new int[5]; // 5 int-containers with empty value

        // declaration, initialization and giving each array-container a value
        int[] userAges2 = {15, 13, 25, 30, 50}; // 5 int-containers with values inside

        // declaration and initialization in different part of code
        int[] userAges3;
        userAges3 = new int[10];
    }
}
