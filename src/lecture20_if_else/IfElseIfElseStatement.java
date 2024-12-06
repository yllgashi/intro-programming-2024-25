package lecture20_if_else;

public class IfElseIfElseStatement {
    public static void main(String[] args) {
// +
// -

//          if-else statement
//         int numberOne = 20;
//         int numberTwo = 10;
//         char arithmeticCharacter = '-';
//
//         if(arithmeticCharacter == '+') {
//             System.out.println(numberOne + numberTwo);
//         }
//         else {
//             System.out.println(numberOne - numberTwo);
//         }


//      if-else-if statement
        int numberOne = 20;
        int numberTwo = 10;
        char arithmeticCharacter = '+';
        // char arithmeticCharacter = '-';
        // char arithmeticCharacter = '*';
        // char arithmeticCharacter = '/';
        // char arithmeticCharacter = '%';
        // char arithmeticCharacter = 'A';

        if (arithmeticCharacter == '+') {
            System.out.println(numberOne + numberTwo);
        }
        else if (arithmeticCharacter == '-') {
            System.out.println(numberOne - numberTwo);
        }
        else if (arithmeticCharacter == '*') {
            System.out.println(numberOne * numberTwo);
        }
        else if (arithmeticCharacter == '/') {
            System.out.println(numberOne / numberTwo);
        }
        else if (arithmeticCharacter == '%') {
            System.out.println(numberOne % numberTwo);
        }
        else {
            System.out.println("This operator is not available");
        }

        System.out.println("Application finnished...");
    }
}
