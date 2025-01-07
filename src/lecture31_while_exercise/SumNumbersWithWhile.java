package lecture31_while_exercise;

public class SumNumbersWithWhile {
    public static void main(String[] args) {
        int sum = 0;
        int counter = 0;

        while (counter <= 10) {
            sum = sum + counter;
            System.out.println("In this iteration total sum is: " + sum + ", iteration number is: " + counter);
            counter++;
        }

        System.out.println(sum); // 0 + 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10
    }
}
