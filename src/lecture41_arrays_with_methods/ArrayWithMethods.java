package lecture41_arrays_with_methods;

public class ArrayWithMethods {
    // create an application which will have an array, initialize data dynamically, print them and find sum of them
    public static void main(String[] args) {
        int[] array = createArray();

        array = initalizeElementsOfArray(array);

        printElementsOfArray(array);

        int totalSum = findSumOfElementsInArray(array);

        printMessage("Total sum is: " + totalSum);
    }

    public static int[] createArray() {
        int[] array = new int[100];
        return array;
    }

    public static int[] initalizeElementsOfArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        return array;
    }

    public static void printElementsOfArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static int findSumOfElementsInArray(int[] array) {
        int totalSum = 0;
        for (int i = 0; i < array.length; i++) {
            totalSum = totalSum + array[i];
        }
        return totalSum;
    }

    public static void printMessage(String message) {
        System.out.println(message);
    }
}


