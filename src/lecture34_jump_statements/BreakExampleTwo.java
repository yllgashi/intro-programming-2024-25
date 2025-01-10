package lecture34_jump_statements;

public class BreakExampleTwo {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {

            System.out.println("i: " + i);

            for (int j = 0; j <= 10; j++) {

                System.out.println("j: " + j);

                if (j == 5) break; // break child-loop (not for with i variable)
            }
        }
    }
}
