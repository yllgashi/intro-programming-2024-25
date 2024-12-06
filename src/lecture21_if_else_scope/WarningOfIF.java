package lecture21_if_else_scope;

public class WarningOfIF {
    public static void main(String[] args) {
        int numberOne = 20;
        int numberTwo = 10;
        char arithmeticSign = '+';

        // if, else-if, else-if, ..., else => only one scope will be executed
//        if(arithmeticSign == '+') {
//            System.out.println(numberOne + numberTwo);
//        }
//        else if(arithmeticSign == '+') {
//            System.out.println(numberOne + numberTwo);
//        }
//        else {
//            System.out.println("Operator does not exists...");
//        }

        // if, if, if, else => it can be executed the same scope if the condition is met
        if(arithmeticSign == '+') {
            System.out.println(numberOne + numberTwo);
        }
        if(arithmeticSign == '+') {
            System.out.println(numberOne + numberTwo);
        }
        else {
            System.out.println("Operator does not exists...");
        }
    }
}
