package lecture17_operators;

public class TernaryOperator {
    public static void main(String[] args) {
        // ternary operator
        // boolean expression ? what to do if it's true : what to do if its false

        int points = 49;
        String passed = points > 51 ? "He/She passed" : "He/She did not passed";
        System.out.println(passed);




        // example 2
        String isTenEqualToEleven = 10 == 11 ? "10 is equal with 11" : "10 is NOT equal with 11";

        // example 3
        String isTenNotEqualToEleven = 10 != 11 ? "10 is NOT equal with 11" : "10 is equal to 11";


        // example 4
        String userName = "yllgashi";
        String userRole = userName == "filanFisteku" ? "Administrator" : "Basic user";
        System.out.println(userRole);
    }
}
