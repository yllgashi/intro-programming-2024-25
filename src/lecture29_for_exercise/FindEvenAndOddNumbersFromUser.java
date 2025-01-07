package lecture29_for_exercise;

import java.util.Scanner;

public class FindEvenAndOddNumbersFromUser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Find even and odd numbers until: ");
        int number = scanner.nextInt();


        for (int counter = 0; counter <= number; counter++) {
            if (counter % 2 == 0) {
                System.out.println(counter + " is even"); // cift
            }
            else {
                System.out.println(counter + " is odd"); // tek
            }
        }
    }
}




