package lecture40_arrays_examples;

import java.util.Scanner;

public class SpecificNumberOfArrayContainers {
    public static void main(String[] args) {
        // Krijo nje aplikacion i cili do te krijoj aq perdorues sa
        // i nevojiten perdoruesit (perdoruesi do te kerkoj sakt numrin)
        // dhe pastaj te inicializohen ato

        Scanner scanner = new Scanner(System.in);

        // ask for users numbers which will be stored in array
        System.out.print("How many users: ");
        int usersNumber = scanner.nextInt();
        scanner.nextLine();

        String[] users = new String[usersNumber];

        // write usernames for specific array-length
        for (int i = 0; i < users.length; i++) {
            System.out.print("Username: ");
            users[i] = scanner.nextLine();
        }

        System.out.println("Data are: ");
        for (int i = 0; i < users.length; i++) {
            System.out.println("Users in index: " + i + " is: " + users[i]);
        }
    }
}
