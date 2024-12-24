package lecture27_for;

import java.util.Scanner;

public class FactorielWithForTwo {
    public static void main(String[] args) {
        // create scanner (which will help us to get value from user)
        Scanner scanner = new Scanner(System.in);

        // ask a number which we will find factories
        System.out.print("Find factories of: ");
        int number = scanner.nextInt();

        // store all factories (give default value of 1)
        int factoriesOfFive = 1;

        for (int i = number; i >= 1; i--) {
            System.out.println("We are finding product with: " + i);
            factoriesOfFive = factoriesOfFive * i;
        }

        System.out.println("Factoriel of number " + number + " is: " + factoriesOfFive);
    }
}
