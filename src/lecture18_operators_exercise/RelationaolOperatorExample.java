package lecture18_operators_exercise;

import java.util.Scanner;

public class RelationaolOperatorExample {
    public static void main(String[] args) {
        // find if value from user is greater than ten (10)

        Scanner scanner = new Scanner(System.in);

        System.out.print("Write number: ");
        int valueFromUser = scanner.nextInt();


        boolean isValueFromUserGreaterThanTen = valueFromUser > 10;
        System.out.println("Is value from user greater than 10: " + isValueFromUserGreaterThanTen);
    }
}
