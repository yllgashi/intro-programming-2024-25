package lecture32_do_while;

import java.util.Scanner;

public class CheckIfNumberIsPositive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = -10;

        do {
            System.out.print("Write number: ");
            number = scanner.nextInt();
        } while (number < 0);

        System.out.println("You have typed a positive number");
    }
}
