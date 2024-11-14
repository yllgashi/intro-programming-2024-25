package lecture12_excercise;

import java.util.Scanner;

public class SecondExcercise {
    public static void main(String[] args) {
        System.out.println("Welcome to football match..");

        Scanner scanner = new Scanner(System.in);

        // we are asking for first club name
        System.out.print("Write first club: ");
        String clubOne = scanner.nextLine();

        // we are asking for second club name
        System.out.print("Write second club: ");
        String clubTwo = scanner.nextLine();

        // we are asking how many goals did first club get
        System.out.print("Goals of club one: ");
        int clubOneGoals = scanner.nextInt();

        // we are asking how many goals did second club get
        System.out.print("Goals of club two: ");
        int clubTwoGoals = scanner.nextInt();

        // we are printing result
        System.out.println("-----------------------------------");
        System.out.printf("%s - %s %d:%d  %n", clubOne, clubTwo, clubOneGoals, clubTwoGoals);       // Kosova – Shqiperia 3:4
        // System.out.println(clubOne + " - " + clubTwo + " " + clubOneGoals + ":" + clubTwoGoals); // Kosova – Shqiperia 3:4
        System.out.println("-----------------------------------");
    }
}
