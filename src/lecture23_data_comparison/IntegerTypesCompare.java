package lecture23_data_comparison;

public class IntegerTypesCompare {
    public static void main(String[] args) {
        // same as: byte, short, int, long
        int intNumberOne = 10;
        int intNumberTwo = 11;

        if(intNumberOne == intNumberTwo) {
            System.out.println("Equals int numbers");
        }
        else {
            System.out.println("Not equals int numbers");
        }
    }
}
