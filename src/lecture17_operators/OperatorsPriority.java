package lecture17_operators;

public class OperatorsPriority {
    public static void main(String[] args) {
        int numOne = 10;
        int numTwo = 20;

        // priority high
        // 1. (), []            => parenthesis
        // 2. ++, --, !         => increment and decrement operators
        // 3. *, /, %           => arithmetic operators
        // 4. +, -              => arithmetic operators
        // 5. <<, >>            => bitwise operators
        // 6. <, >, >=, <=      => relational operators
        // 7. ==, !=            => relational operators
        // 8. &                 => logical boolean operator
        // 9. ^                 => logical boolean operator
        // 10. |                => logical boolean operator
        // 11. &&               => logical boolean operator
        // 12. ||               => logical boolean operator
        // 13. ?                => ternary operator
        // 14. =                => assignment operator
        // priority low

        int resultOne = numOne + 1 * numTwo + 1;
        int resultTwo = ++numOne * ++numTwo;
    }
}
