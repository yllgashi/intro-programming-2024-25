package lecture32_do_while;

public class FindEvenNumbersWithDoWhile {
    public static void main(String[] args) {
        int counter = 0;

        do {

            // find if its even
            if (counter % 2 == 0) {
                System.out.println(counter);
            }

            counter++;
        } while (counter <= 100);
    }
}
