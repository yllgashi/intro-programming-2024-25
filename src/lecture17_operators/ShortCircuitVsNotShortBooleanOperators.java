package lecture17_operators;

public class ShortCircuitVsNotShortBooleanOperators {
    public static void main(String[] args) {
        // division by 0 it gives us run-time error
        // with short-circuit-AND (&&) we are ignoring this error

        boolean resultOne = (10 < 0) && (10 / 0 == 2);
        System.out.println(resultOne);



        boolean resultTwo = (10 < 0) & (10 / 0 == 2);
        System.out.println(resultTwo);
    }
}
