package lecture22_if_else_exercises;

import java.util.Scanner;

public class EasyExample {
    public static void main(String[] args) {
        // Te shkruhet nje program I cili pranon nga -10000 deri ne 10000.
        // Nese eshte shkruar brenda ketij  rangu te shfaqet
        // mesazhi “numri eshte ne rangun e dhene” perndryshe te shfaqet
        // mesazhi “numri nuk eshte ne rangun e dhene”

        Scanner scanner = new Scanner(System.in);

        // get number from user
        System.out.print("Number: ");
        int number = scanner.nextInt();

        // validate if number is inside range -10000 - +10000
        if(number >= -10_000 && number <= 10_000) {
            System.out.println("The number is inside range");
        }
        // else (when the number did not meet that condition
        else {
            System.out.println("The number is NOT inside range");
        }
    }
}
