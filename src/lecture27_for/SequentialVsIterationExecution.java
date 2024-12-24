package lecture27_for;

public class SequentialVsIterationExecution {
    public static void main(String[] args) {
        // Sequential
        System.out.println("This code will be executed 10 times");
        System.out.println("This code will be executed 10 times");
        System.out.println("This code will be executed 10 times");
        System.out.println("This code will be executed 10 times");
        System.out.println("This code will be executed 10 times");
        System.out.println("This code will be executed 10 times");
        System.out.println("This code will be executed 10 times");
        System.out.println("This code will be executed 10 times");
        System.out.println("This code will be executed 10 times");
        System.out.println("This code will be executed 10 times");

        // iteration
        for (int counter = 0; counter < 10; counter++) {
            System.out.println("This code will be executed 10 times");
        }
    }
}
