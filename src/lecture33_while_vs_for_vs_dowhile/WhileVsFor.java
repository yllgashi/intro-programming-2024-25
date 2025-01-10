package lecture33_while_vs_for_vs_dowhile;

public class WhileVsFor {
    public static void main(String[] args) {
        // sum numbers from 0 to 10


        // for
        int sumFromFor = 0;

        for (int i = 0; i <= 10; i++) {
            sumFromFor = sumFromFor + i;
        }

        System.out.println("Total value of sum (with for-loop): " + sumFromFor);


        // while
        int sumfromWhile = 0;
        int j = 0;

        while (j <= 10) {
            sumfromWhile = sumfromWhile + j;
            j++;
        }

        System.out.println("Total value of sum (with while-loop): " + sumFromFor);
    }
}
