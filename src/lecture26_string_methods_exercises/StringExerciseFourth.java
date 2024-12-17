package lecture26_string_methods_exercises;

import java.util.Scanner;

public class StringExerciseFourth {
    public static void main(String[] args) {
        // Pasi shfrytëzuesi te jep tekstin atëherë program paraqet mesazhin:
        // Shkruaj tekstin qe po kërkoni ta zëvendësoni: “fjala”
        // Shkruani tekstin zëvendësues: “fjalaTjeter” Paraqitni tekstin me ndryshime?

        // Kosova eshte shtet i pavarur
        // Kosova
        // Shqiperia
        // Shqiperia eshte shtet i pavarur

        // .replace()

        Scanner scanner = new Scanner(System.in);

        System.out.print("Write text: ");
        String text = scanner.nextLine();

        System.out.print("Word you want to replace: ");
        String target = scanner.nextLine();

        System.out.print("Word you want to replace with: ");
        String replacement = scanner.nextLine();

        // first scenario
        String replacedText = text.replace(target, replacement);
        System.out.println("Replaced text is: " + replacedText);


        // ignore lower-upper case
        String textInLowerCase = text.toLowerCase();
        String targetInLowerCase = target.toLowerCase();
        String replacementInLowerCase = replacement.toLowerCase();
        String replacedTextInLowerCase = textInLowerCase.replaceAll(targetInLowerCase, replacementInLowerCase);
        System.out.println("Replaced text is: " + replacedTextInLowerCase);
    }
}
