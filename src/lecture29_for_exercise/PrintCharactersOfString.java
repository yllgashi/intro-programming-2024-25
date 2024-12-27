package lecture29_for_exercise;

import java.util.Scanner;

public class PrintCharactersOfString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Write full name: ");
        String fullName = scanner.nextLine();

        for (int index = 0; index < fullName.length(); index++) {
            // System.out.println("Index is: " + index);
            char characterInThatIndex = fullName.charAt(index);
            System.out.println(characterInThatIndex);
        }
    }
}
