package lecture20_if_else;

public class IfStatement {
    public static void main(String[] args) {

        int number = 5;

        // if this condition "5 > 10" it gives us a "false", then the scope inside parentheses will NOT be executed
        if (number > 10) {
            System.out.println("Number it is bigger than 10");
        }


        // if this condtion "5 < 10" it gives us a "true", then the scope inside parentheses will be executed
        if (number < 10) {
            System.out.println("Number it is smaller than 10");
        }

        System.out.println("Code will execute there...");
    }
}
