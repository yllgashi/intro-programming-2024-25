package lecture34_jump_statements;

public class ContinueExampleOne {
    public static void main(String[] args) {
        // print all numbers from 0 to 10 but skip printing-part of number 5

        for (int i = 0; i <= 10; i++) {
            if (i == 5) continue; // go to the next iteration and skip all codes above inside loop
            System.out.println(i);
        }
    }
}
