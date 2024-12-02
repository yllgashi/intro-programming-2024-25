package lecture17_operators;

public class BooleanLogicalOperators {
    public static void main(String[] args) {
        // AND (&) => All booleans are true in order for result to be true
        System.out.println(true & true); // true
        System.out.println(true & false); // false
        System.out.println(false & false); // false
        System.out.println(true & true & false); // false
        System.out.println(true & true & true); // true

        boolean trueTrueAND = true & true; // we can store the result in boolean type
        boolean trueFalseAND = true & false; // we can store the result in boolean type
        boolean falseFalseAND = false & false; // we can store the result in boolean type







        // Short-circuit AND (&&) =>  All booleans are true in order for result to be true (but it can evaluate only one side of statement)
        System.out.println(true && true); // true
        System.out.println(true && false); // false
        System.out.println(false && false); // false
        System.out.println(true && true && false); // false
        System.out.println(true && true && true); // true






        // OR (|) => It is enough only for one boolean to be true in order for result to be true
        System.out.println(true | true); // true
        System.out.println(true | false); // true
        System.out.println(false | false); // false
        System.out.println(true | false | false); // true
        System.out.println(false | false | false); // false

        boolean trueTrueOR = true | true; // we can store the result in boolean type
        boolean trueFalseOR = true | false; // we can store the result in boolean type
        boolean falseFalseOR = false | false; // we can store the result in boolean type








        // Short-circuit OR (||) => It is enough only for one boolean to be true in order for result to be true (but it can evaluate only one side of statement)
        System.out.println(true || true); // true
        System.out.println(true || false); // true
        System.out.println(false || false); // false
        System.out.println(true || false || false); // true
        System.out.println(false || false || false); // false







        // XOR (^) => Booleans should be different with each other in order for result to be true
        System.out.println(true ^ true); // false
        System.out.println(true ^ false); // true
        System.out.println(false ^ false); // false

        boolean trueTrueXOR = true ^ true; // we can store the result in boolean type
        boolean trueFalseXOR = true ^ false; // we can store the result in boolean type
        boolean falseFalseXOR = false ^ false; // we can store the result in boolean type







        // Negation (!) => It will return other value of boolean
        System.out.println(!true); // false
        System.out.println(!false); // true

        boolean trueNEG = !true; // we can store the result in boolean type
        boolean falseNEG = !false; // we can store the result in boolean type
    }
}
