package lecture14_random;

import java.util.Scanner;

public class RandomUserApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to generating random numbers app...");
        System.out.print("This application will generate random numbers from 0 to: ");

        int maxIntNumber = scanner.nextInt();


        int randomIntNumber = (int) (Math.random() * maxIntNumber);

        System.out.println("Random number is: " + randomIntNumber);

    }
}
