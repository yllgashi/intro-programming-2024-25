package lecture27_for;

public class SubNumbersInFor {
    public static void main(String[] args) {
        // 5 - 4 - 3 - 2 - 1


        // we can use counter also in this way
        for (int counter = 5; counter >= 0; counter--) {
            System.out.println(counter);
        }


        // subtract numbers
        int sub = 5;

        for (int counter = 4; counter >= 0; counter--) {
            sub -= counter;
        }
    }
}
