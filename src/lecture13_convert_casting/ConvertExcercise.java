package lecture13_convert_casting;

import java.util.Scanner;

public class ConvertExcercise {
    public static void main(String[] args) {
        // I want to use Scanner to get int and double values without using "nextInt(), nextDouble()"

        Scanner scanner = new Scanner(System.in);

        String intValueAsString = scanner.nextLine();
        String doubleValueAsString = scanner.nextLine();

        int intValue = Integer.parseInt(intValueAsString);
        double doubleValue = Double.parseDouble(doubleValueAsString);
    }
}
