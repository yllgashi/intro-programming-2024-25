package lecture31_while_exercise;

public class FindDivisionWithoutItsOperator {
    public static void main(String[] args) {
        int numOne = 15;
        int numTwo = 5;
        int howManyTimesDidNumTwoGoToNumOne = 0;

        // 15 - 5 => one time
        // 10 - 5 => second time
        // 5 - 5 => third time
        // 0 - 5 => we cannot do this operation because 5 is less value than 0

        while (numOne >= numTwo) {
            howManyTimesDidNumTwoGoToNumOne++;
            numOne = numOne - numTwo;
        }

        System.out.println("NumTwo it goes this times in NumOne: " + howManyTimesDidNumTwoGoToNumOne);
    }
}
