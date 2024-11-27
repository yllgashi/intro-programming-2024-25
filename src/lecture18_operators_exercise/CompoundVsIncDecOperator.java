package lecture18_operators_exercise;

public class CompoundVsIncDecOperator {
    public static void main(String[] args) {
        // add +1 in "myGrade" variable

        int myGrade = 10;

        // standard way
        myGrade = myGrade + 1;

        // compound operator
        myGrade += 1;

        // increment operator
        myGrade--;
    }
}
