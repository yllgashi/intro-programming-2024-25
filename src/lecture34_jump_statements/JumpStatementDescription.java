package lecture34_jump_statements;

public class JumpStatementDescription {
    public static void main(String[] args) {
        // "continue" => if we want to go to the next iteration and skip all lines of code below "continue"
        // "break"    => if we want to exit the whole loop

        // 0 1 2 3 4 6 7 8 9 10 (5 is ignored)
        for (int i = 0; i <= 10; i++) {
            if (i == 5) continue;
            System.out.println(i);
        }

        // 0 1 2 3 4 (if 5 is reached then the loop is exited)
        for (int i = 0; i <= 10; i++) {
            if (i == 5) break;
            System.out.println(i);
        }
    }
}
