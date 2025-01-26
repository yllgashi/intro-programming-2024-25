package lecture41_arrays_with_methods;

import java.util.Scanner;

public class UsersCRUD {
    public static void main(String[] args) {
        int totalUsers = 5;

        String[] users = new String[totalUsers];

        users = createUsers(users);

        printUsers(users);

        printUserByIndex(users, 2);

        updateUserByIndex(users, 2, "fistekuFilan");

        deleteUserByIndex(users, 3);

        printUsers(users);
    }

    public static String[] createUsers(String[] users) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < users.length; i++) {
            System.out.print("Username: ");
            users[i] = scanner.nextLine();
        }
        return  users;
    }

    public static void printUsers(String[] users) {
        for (int i = 0; i < users.length; i++) {
            System.out.println("Index: " + i + ", Username: " + users[i]);
        }
    }

    public static void printUserByIndex(String[] users, int index) {
        if (index >= 0 && index < users.length) {
            System.out.println(users[index]);
        }
        else {
            System.out.println("User not found");
        }
    }

    public static void updateUserByIndex(String[] users, int index, String newUsername) {
        if (index >= 0 && index < users.length) {
        users[index] = newUsername;
        }
        else {
            System.out.println("User not found");
        }
    }

    public static void deleteUserByIndex(String[] users, int index) {
        if (index >= 0 && index < users.length) {
        users[index] = "";
        }
        else {
            System.out.println("User not found");
        }
    }
}
