package lecture17_operators;

public class RelationalOperators {
    public static void main(String[] args) {


        // >
        boolean isTenGreaterThanTwenty = 10 > 20;
        System.out.println(isTenGreaterThanTwenty);


        // >=
        boolean isTenGreaterOrEqualToTwenty = 10 >= 10;
        System.out.println(isTenGreaterOrEqualToTwenty);


        // <
        boolean isTenSmallerThanTwenty = 10 < 20;
        System.out.println(isTenSmallerThanTwenty);


        // <=
        boolean isTenSmallerOrEqualToTwenty = 10 <= 10;
        System.out.println(isTenSmallerOrEqualToTwenty);


        // =
        boolean isTenEqualToTwenty = 10 == 20;
        System.out.println(isTenEqualToTwenty);


        // !=
        boolean isTenDifferentThanTwenty = 10 != 20;
        System.out.println(isTenDifferentThanTwenty);



        // relational operators in String


        // ==
        boolean isTextOneEqualToTextTwo = "Password1" == "Password1";


        // !=
        boolean isTextOneNotEqualToTextTwo = "Password1" != "Password1";
    }
}
