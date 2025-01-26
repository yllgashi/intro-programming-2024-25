package lecture40_arrays_examples;

public class SumElementsInArray {
    public static void main(String[] args) {
        int[] array = new int[5];
        array[0] = 1;
        array[1] = 20;
        array[2] = 30;
        array[3] = 22;
        array[4] = 35;

        // first approach
        System.out.println("Total sum is: " + (array[0] + array[1] + array[2] + array[3] + array[4]));


        // second approach
        int totalSum = 0;
        for (int i = 0; i < array.length; i++) {
            totalSum = totalSum + array[i];
        }

        System.out.println("Total sum is: " + totalSum);
    }
}
