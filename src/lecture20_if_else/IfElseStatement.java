package lecture20_if_else;

public class IfElseStatement {
    public static void main(String[] args) {
        int number = 10;
        // int number = -10;

        // if "number > 0" is true, then the code inside "IF" brackets will be executed
        // if "number > 0" is false, then the code inside "ELSE" brackets will be executed


        if (number > 0) {
            System.out.println("This number is positive");
        }
        else {
            System.out.println("This number is negative");
        }

        System.out.println("Application ended...");
    }
}
