package lecture26_string_methods_exercises;

import java.util.Scanner;

public class StringLengthExample {
    public static void main(String[] args) {
        // 1. Get first and last character of a string

        // this text has 9 characters
        // String text = "Yll Gashi";

        // first char it is in position 0
        // char firstChar = text.charAt(0);

        // last char it is in position 8
        // char lastChar = text.charAt(8);

        // print characters:
        // System.out.println("First character is: " + firstChar);
        // System.out.println("Last character is: " + lastChar);





        // WHAT IF TEXT IS GIVEN BY USER AND WE HAVE TO GET FIRST AND LAST CHARACTER

        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        // first char it is in position 0
        char firstChar = text.charAt(0);

        // we don't know the position of last char, we need to get it in another way
        int howManyCharsInText = text.length();
        char lastChar = text.charAt(howManyCharsInText - 1);

        // print characters:
        System.out.println("First character is: " + firstChar);
        System.out.println("Last character is: " + lastChar);
    }
}
