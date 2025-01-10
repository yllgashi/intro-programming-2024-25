package lecture32_do_while;

public class PrintNumbersWithDoWhile {
    public static void main(String[] args) {
        int counter = 0;

        do {
            System.out.println(counter);
            counter = counter + 1;
        } while (counter <= 100);
    }
}
