package lecture33_while_vs_for_vs_dowhile;

import java.util.Scanner;

public class DoWhileVsWhileVsFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // do while (code inside brackets will be executed once or more
        int numberInDoWhile = -10;
        do {
            System.out.print("Write number: ");
            numberInDoWhile = scanner.nextInt();
        } while (numberInDoWhile < 0);

        System.out.println("You have typed a positive number");



        // while (code inside brackets will not be executed (because of condition)
        int numberInWhile = -10;
        while (numberInWhile < 0) {
            System.out.print("Write number: ");
            numberInWhile = scanner.nextInt();
        }

        // for
        int numberInFor = -10;
        for (int i = 0; numberInFor < 0; i++) {
            System.out.print("Write number: ");
            numberInFor = scanner.nextInt();
        }
    }
}
