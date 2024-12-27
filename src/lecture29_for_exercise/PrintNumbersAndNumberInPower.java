package lecture29_for_exercise;

public class PrintNumbersAndNumberInPower {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            System.out.println("Number is: " + i + ", number in square is: " + Math.pow(i, 2));
        }
    }
}
