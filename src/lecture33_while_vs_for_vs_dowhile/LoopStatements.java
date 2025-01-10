package lecture33_while_vs_for_vs_dowhile;

public class LoopStatements {
    public static void main(String[] args) {
        // print numbers from 0 to 10

        // for
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }


        // while
        int i = 0;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }

        // do-while
        int j = 0;
        do {
            System.out.println(j);
            j++;
        } while (j <= 10);
    }
}
