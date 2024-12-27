package lecture29_for_exercise;

import java.util.Scanner;

public class FindEvenNumbers {
    public static void main(String[] args) {
        // gjej numrat cift nga 1 deri ne N

        Scanner scanner = new Scanner(System.in);

        System.out.print("Write number: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

    }
}
