package lecture17_operators;

public class BitwiseOperators {
    public static void main(String[] args) {
        int numOne = 42;
        int numTwo = 15;


        // AND bitwise operator
        int resultAND = numOne & numTwo;
        System.out.println(resultAND);


        // OR bitwise operator
        int resultOR = numOne | numTwo;
        System.out.println(resultOR);


        // XOR bitwise operator
        int resultXOR = numOne ^ numTwo;
        System.out.println(resultXOR);


        // Unary-NOT bitwise operator
        int resultNeg = ~numOne;
        System.out.println(resultNeg);



        // shift right bitwise operator
        int resultSHIFTRIGHT = numOne >> 1;
        System.out.println(resultSHIFTRIGHT);



        // shift left bitwise operator
        int resultSHIFTLEFT = numOne << 1;
        System.out.println(resultSHIFTLEFT);
    }
}
