package lecture31_while_exercise;

import java.util.Scanner;

public class ChatWithTwoPeople {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Person 1: ");
            String chatFromPersonOne = scanner.nextLine();

            System.out.print("Person 2: ");
            String chatFromPersonTwo = scanner.nextLine();
        }
    }
}
