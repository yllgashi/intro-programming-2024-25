package lecture17_operators;

public class CombineMultipleOperators {
    public static void main(String[] args) {
        // boolean logical operators
        // relational operators
        // arithmetic operators
        // bitwise operators
        // ...


        // we have combined relational and arithmetic operators
        boolean combineRelationalAndArith = (10 + 30) > 20;
        System.out.println(combineRelationalAndArith);



        // we have combined relational and boolean logical operators
        boolean combineRelationalAndBooleanLog = (50 > 10) && true;
        System.out.println(combineRelationalAndBooleanLog);

        boolean combineRelationalAndBooleanLog2 = (50 < 10) || true;
        System.out.println(combineRelationalAndBooleanLog2);
    }
}
