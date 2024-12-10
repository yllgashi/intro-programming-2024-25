package lecture24_switch;

import java.util.Scanner;

public class SwitchVsIfElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1. Dashboard");
        System.out.println("2. AboutMe");
        System.out.println("3. ContactUs");

        System.out.println();

        System.out.print("Navigate to:");
        String menu = scanner.nextLine();


        // SWITCH
        switch (menu) {
            case "Dashboard":
                System.out.println("Welcome to Dashboard page");
                System.out.println("This is a social networking platform");
                break;
            case "AboutMe":
                System.out.println("Welcome to About Me page");
                System.out.println("My name is Filan Fisteku");
                System.out.println("I am from Kosova");
                break;
            case "ContactUs":
                System.out.println("Welcome to Contact Us page");
                System.out.println("My email is: filan@filan.com");
                break;
            default:
                System.out.println("...404 Not Found...");
        }


        // IF-ELSE
        if (menu.equals("Dashboard")) {
            System.out.println("Welcome to Dashboard page");
            System.out.println("This is a social networking platform");
        } else if (menu.equals("AboutMe")) {
            System.out.println("Welcome to About Me page");
            System.out.println("My name is Filan Fisteku");
            System.out.println("I am from Kosova");
        } else if (menu.equals("ContactUs")) {
            System.out.println("Welcome to Contact Us page");
            System.out.println("My email is: filan@filan.com");
        } else {
            System.out.println("...404 Not Found...");
        }
    }
}
