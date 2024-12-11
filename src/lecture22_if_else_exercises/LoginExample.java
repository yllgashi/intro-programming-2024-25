package lecture22_if_else_exercises;

import java.util.Scanner;

public class LoginExample {
    public static void main(String[] args) {
        // Suppose that in this social platform there is only one user:
        // username = "Admin", password = "Admin"

        Scanner scanner = new Scanner(System.in);

        System.out.print("Username: ");
        String username = scanner.nextLine();

        System.out.print("Password: ");
        String password = scanner.nextLine();


        // we have different things to do foreach different cases
        if (username != "Admin") {
            System.out.println("Show incorrect-username.html");
        }
        else if(password != "Admin") {
            System.out.println("Show correct-username-but-incorrect-password.html");
        }
        else {
            System.out.println("Show successfully-logged-in.html");
        }
    }
}
