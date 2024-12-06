package lecture21_if_else_scope;

public class IfElseScopeProblemSolved {
    public static void main(String[] args) {
        char arithmeticOperator = '+';

        int numberOne = 0;
        int numberTwo = 0;
        int result = 0;

        if (arithmeticOperator == '+') {
            numberOne = 10;
            numberTwo = 20;
            result = numberOne + numberTwo;

            System.out.println(numberOne);
            System.out.println(numberTwo);
            System.out.println(result);
        }

        System.out.println(numberOne);
        System.out.println(numberTwo);
        System.out.println(result);
    }
}
