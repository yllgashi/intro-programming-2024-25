package lecture20_if_else;

public class IfElseVSTernaryOperator {
    public static void main(String[] args) {
        int number = 10;
        String textFromIfElse = "";
        String textFromTernaryOperator = "";


        // if-else
        if (number > 0) {
            textFromIfElse = "Positive number";
        } else {
            textFromIfElse = "Negative number";
        }

        // ternary operator
        textFromTernaryOperator = number > 0 ? "Positive number" : "Negative number";
    }
}
