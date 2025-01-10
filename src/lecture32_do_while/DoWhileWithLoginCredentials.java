package lecture32_do_while;

import java.util.Scanner;

public class DoWhileWithLoginCredentials {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username = "";
        String password = "";

        do {
            System.out.print("Username: ");
            username = scanner.nextLine();

            System.out.print("Password: ");
            password = scanner.nextLine();

            if (username.equals("admin") && password.equals("12345")) {
                System.out.println("Logged in successfully");
            }
        }while (!(username.equals("admin") && password.equals("12345")));
    }
}
