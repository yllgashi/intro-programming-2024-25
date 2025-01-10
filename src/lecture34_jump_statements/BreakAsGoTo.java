package lecture34_jump_statements;

public class BreakAsGoTo {
    public static void main(String[] args) {
        first: {
            System.out.println("First scope");
            second: {
                System.out.println("Second scope");
                third: {
                    System.out.println("Third scope");
                    if(true) break second;
                }
            }
        }
    }
}
