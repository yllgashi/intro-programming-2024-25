package lecture11_inputs;


import java.util.Scanner;

public class ScannerSecondExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Write username: ");
        String username = scanner.nextLine();

        System.out.print("Write password: ");
        String password = scanner.nextLine();

        System.out.println("Hey " + username + ", you logged in successfully...");

    }
}
