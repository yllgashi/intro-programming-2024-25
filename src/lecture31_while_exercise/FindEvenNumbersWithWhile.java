package lecture31_while_exercise;

import java.util.Scanner;

public class FindEvenNumbersWithWhile {
    public static void main(String[] args) {
        // gjej numrat cift nga 1 deri ne N

        Scanner scanner = new Scanner(System.in);

        System.out.print("Write number: ");
        int n = scanner.nextInt();

        int i = 1;

        while (i <= n) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }
    }
}
