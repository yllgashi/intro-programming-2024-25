package lecture12_excercise;


import java.util.Scanner;
public class FirstExcercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Zgjedh ekipin tuaj te zemres:");

        String ekipi = scanner.nextLine();

        System.out.println("Ju keni zgjedhur: " + ekipi);
    }
}
