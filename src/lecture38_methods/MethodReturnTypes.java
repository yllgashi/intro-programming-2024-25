package lecture38_methods;

import java.util.Scanner;

public class MethodReturnTypes {
    public static void main(String[] args) {
        // method which will NOT return anything
        printSomething();

        // method which returns int
        int sumOfTwoNumbers = sumTwoNumbers();
        System.out.println(sumOfTwoNumbers);

        // method which returns double
        double sumOfFloatingPointNumbers = sumThreeFloatingPointNumbers();
        System.out.println(sumOfFloatingPointNumbers);

        // method which returns String
        String username = getUsername();
        System.out.println(username);

        // method which returns char
        char gender = getGender();

        // method which returns boolean
        boolean isUserActive = isUserActive();
        if (isUserActive) {
            System.out.println("Welcome to our class, you are active");
        } else {
            System.out.println("No access, you are inactive");
        }
    }

    public static void printSomething() {
        System.out.println("Hi there");
    }

    public static int sumTwoNumbers() {
        int result = 10 + 20;
        return result;
    }

    public static double sumThreeFloatingPointNumbers() {
        double result = 10.50 + 20.30 + 1.10;
        return result;
    }

    public static String getUsername() {
        String username = "filanfisteku123";
        return username;
    }

    public static char getGender() {
        char gender = 'M';
        return gender;
    }

    public static boolean isUserActive() {
        boolean isActive = true;
        return isActive;
    }
}
