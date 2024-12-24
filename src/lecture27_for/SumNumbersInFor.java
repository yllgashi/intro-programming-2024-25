package lecture27_for;

public class SumNumbersInFor {
    public static void main(String[] args) {
        // 0 + 1 + 2 + 3 + 4 + 5

        int sum = 0;

        for (int counter = 0; counter <= 5; counter++) {
            sum += counter;
        }

        System.out.println("Total sum is: " + sum);
    }
}
