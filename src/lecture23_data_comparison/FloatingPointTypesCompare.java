package lecture23_data_comparison;

public class FloatingPointTypesCompare {
    public static void main(String[] args) {
        // float, double
        double numOne = 3.141592653;
        double numTwo = 3.14;

        // THIS WAY WE ARE GETTING WRONG RESULT
//        if (numOne == numTwo) {
//            System.out.println("Number one is equal with number two");
//        } else {
//            System.out.println("Number one is NOT equal with number two");
//        }


        // THE BEST WAY: WE ARE TOLERATING NUMBERS AFTER THIRD FLOATING-POINT NUMBER...
        double tolerance = 0.01;

        if (Math.abs(numOne - numTwo) < tolerance) {
            System.out.println("Number one is equal with number two (with tolerance after third number)");
        } else {
            System.out.println("Number one is NOT equal with number two");
        }
    }
}
