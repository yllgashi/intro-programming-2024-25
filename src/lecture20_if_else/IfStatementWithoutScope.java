package lecture20_if_else;

public class IfStatementWithoutScope {
    public static void main(String[] args) {
        int number = 20;

        // you can use if-sentence without parenthesies only if you have just ONE LINE in scope
        if (number > 0)
            System.out.println("Number is positive");

        if (number > 0) {
            System.out.println("Number is positive");
        }

    }
}
