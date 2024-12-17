package lecture26_string_methods_exercises;

import java.util.Scanner;

public class StringExerciseThree {
    public static void main(String[] args) {
        // Pasi shfrytëzuesi te shkruan tekstin atëherë
        // program paraqet mesazhin: Shkruaj fjalën qe
        // po kërkoni: “fjala” Pastaj program shfaq
        // mesazhin: Fjala e dhënë “fjala” gjendet/nuk gjendet ne tekst:
        // Nëse gjendet ne tekst atëherë shfaqe indeksin se ku fillon ajo fjale ne tekst

        // .contains()
        // .indexOf()

        Scanner scanner = new Scanner(System.in);

        System.out.print("Write text: ");
        String text = scanner.nextLine();

        System.out.print("Check if word exists: ");
        String searchedWord = scanner.nextLine();

        // check if word exists inside text
        boolean doesWordExistsInsideText = text.contains(searchedWord);
        System.out.println("Does word exists inside text: " + doesWordExistsInsideText);

        // get that word index inside text
        int index = text.indexOf(searchedWord);
        System.out.println("Searched word exists from index: " + index);


        // another way of this program is:
        int anotherIndex = text.indexOf(searchedWord);
        if(anotherIndex != -1) {
            System.out.println("Does word exists inside text: " + true);
            System.out.println("Searched word exists from index: " + anotherIndex);
        }
        else {
            System.out.println("Does word exists inside text: " + false);
        }
    }
}
