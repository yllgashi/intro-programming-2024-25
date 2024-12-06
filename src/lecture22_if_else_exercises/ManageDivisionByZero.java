package lecture22_if_else_exercises;

public class ManageDivisionByZero {
    public static void main(String[] args) {
        int numberOne = 20;
        int numberTwo = 0; // division by zero throws an error... (we need to manage it)

        System.out.println(numberOne + numberTwo);
        System.out.println(numberOne - numberTwo);
        System.out.println(numberOne * numberTwo);

        if (numberTwo == 0) {
            System.out.println("Cannot perform division by zero");
        } else {
            System.out.println(numberOne / numberTwo);
        }
    }
}
