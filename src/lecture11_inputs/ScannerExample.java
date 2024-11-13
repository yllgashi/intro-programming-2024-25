package lecture11_inputs;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        // create scanner tool which will help us to get data from user
        Scanner scanner = new Scanner(System.in);

        // with this code, user can type text in console
        // save texts in variables
        String username = scanner.nextLine();
        String password = scanner.nextLine();

        // print information which is saved in variables
        System.out.println("Username of user is: " + username);
        System.out.println("Password of user is: " + password);
    }
}
