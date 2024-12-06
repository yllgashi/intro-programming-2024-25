package lecture22_if_else_exercises;

public class FindIfNumberIsFullyDivisible {
    public static void main(String[] args) {
        int numOne = 5;
        int numTwo = 2;

        if(numOne % numTwo == 0) {
            System.out.println("Numbers are fully divisible");
        }
        else {
            System.out.println("Numbers are not fully divisible");
        }
    }
}
