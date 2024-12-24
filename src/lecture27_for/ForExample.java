package lecture27_for;

public class ForExample {
    public static void main(String[] args) {
        // int counter = 0 --> Helper variable which will hold loop-execution times
        // counter < 5 --> If this condition is true the code will be exucted, if its not then it will not be executed
        // counter++ --> We will increment this variable each time code inside '{}' is executed

        for (int counter = 0; counter < 5; counter++) {
            System.out.println("This code will be exectued 5 times...");
        }
    }
}
