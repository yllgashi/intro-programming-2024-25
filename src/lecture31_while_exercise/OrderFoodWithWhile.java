package lecture31_while_exercise;

import java.util.Scanner;

public class OrderFoodWithWhile {
    public static void main(String[] args) {
//        Krijo aplikacionin e menu-se të ushqimit i cili i paraqet konsumatorit listën për të zgjedhur njërin nga numrat e faqeve të menusë:
//        1 - Menu e mengjesit
//        2 - Menu e darkës
//
//        Dhe pastaj varësisht nga opsioni i zgjedhur shfaqet rezultati
//
//        Në rastin kur përdoruesi shtyp:
//        1 - Të shfaqet një listë e ushqimit të mëngjesit (omlet me vezë, omlet shtëpie)
//        2 - Të shfaqet një listë e darkës (hamburger, pica)

        Scanner scanner = new Scanner(System.in);

        System.out.println("*******************");
        System.out.println("Welcome to my restaurant");
        System.out.println("*******************");

        int inputFromCustomer = -1;

        while (inputFromCustomer != 4) {
            System.out.println("Menu");
            System.out.println("1 - Order morning menu");
            System.out.println("2 - Order dinner menu");
            System.out.println("3 - Order a drink");
            System.out.println("4 - Close ordering for customer (Administrator)");

            System.out.print("Write option: ");
            inputFromCustomer = scanner.nextInt();

            switch (inputFromCustomer) {
                case 1:
                    System.out.println("You have order morning menu successfully");
                    break;
                case 2:
                    System.out.println("You have order dinner menu successfully");
                    break;
                case 3:
                    System.out.println("You have order a drink successfully");
                    break;
                case 4:
                    System.out.println("Application has stopped");
                    break;
                default:
                    System.out.println("Try again...");
            }
        }
    }
}
