package lecture31_while_exercise;

import java.util.Scanner;

public class LoginWithWhile {
    public static void main(String[] args) {
        // credentials are
        // Username: admin
        // Password: myPassword
        // it will let the user only three times to try

        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        boolean areCredentialsValid = true;
        String username = "";
        String password = "";

        while (!(username.equals("admin") && password.equals("myPassword")) && counter < 3) {
            System.out.print("Username: ");
            username = scanner.nextLine();

            System.out.print("Password: ");
            password = scanner.nextLine();

            if (!(username.equals("admin") && password.equals("myPassword"))) {
                areCredentialsValid = false;
            }
            counter++;
        }

        if (!areCredentialsValid) {
            System.out.println("Invalid username or password and you account has been blocked");
        }
        else {
            System.out.println("You have logged in successfully");
        }

    }
}
