package lecture34_jump_statements;

public class BreakExampleOne {
    public static void main(String[] args) {
        // show numbers from 0 to 5

        for (int i = 0; i <= 10; i++) {
            if (i == 6) {
                break; // exit loop
            }
            System.out.println(i);
        }

        System.out.println("Application ended...");
    }
}
