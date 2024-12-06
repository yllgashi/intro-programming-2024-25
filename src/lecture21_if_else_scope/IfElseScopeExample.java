package lecture21_if_else_scope;

public class IfElseScopeExample {
    public static void main(String[] args) {
        char arithmeticOperator = '+';



        // life of variable its defined only inside scope
        // if scope is ended (with '}') then all existing variables inside scope are removed
        if (arithmeticOperator == '+') {
            int numberOne = 10;
            int numberTwo = 20;
            int result = numberOne + numberTwo;

            System.out.println(numberOne);
            System.out.println(numberTwo);
            System.out.println(result);
        }

        // we cannot use these variables because it doesn't exists in this scope
        // System.out.println(numberTwo);
        // System.out.println(result);

        // we are free to create once again variable with the same name
        int numberOne = 10;
        System.out.println(numberOne);
    }
}
