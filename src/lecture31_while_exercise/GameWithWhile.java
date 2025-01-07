package lecture31_while_exercise;

import java.util.Scanner;

public class GameWithWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Do you want to play: ");
        String answer = scanner.nextLine(); // Yes or No

        while (answer.equals("Yes")) {
            System.out.println("Game started");
            System.out.println("Player drives a car");
            System.out.println("Car crashes");
            System.out.println("Game ended...");

            // there we can change condition of code
            System.out.print("Try again?: ");
            answer = scanner.nextLine(); // Yes or No
        }

        System.out.println("Game stopped...");
    }
}
