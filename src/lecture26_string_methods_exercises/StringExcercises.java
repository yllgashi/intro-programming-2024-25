package lecture26_string_methods_exercises;

import java.util.Scanner;

public class StringExcercises {
    public static void main(String[] args) {
        // Pasi shfrytëzuesi te shkruan tekstin
        // atëherë programi shfaq ne program numrin e karaktereve qe teksti përmban?

        // .length()

        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        System.out.println("Total characters: " + text.length());
    }
}
