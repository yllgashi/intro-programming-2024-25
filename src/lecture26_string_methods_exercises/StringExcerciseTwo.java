package lecture26_string_methods_exercises;

import java.util.Scanner;

public class StringExcerciseTwo {
    public static void main(String[] args) {
        // Pasi shfrytëzuesi te jep tekstin atëherë program paraqet mesazhin:
        // Shkruaj indeksin nga 0 deri me A (A- gjatësia e tekstit paraprak)
        // për ta paraqitur tekstin nga indeksi deri ne fund:
        // Pasi shfrytëzuesi shkruan atë numër të shfaqet pjesa e tekstit nga indeksi deri ne fund

        // .substring()
        // .length()

        // K o s o v a   r e p u  b  l  i  k
        // 0 1 2 3 4 5 6 7 8 9 10 11 12 13 14


        Scanner scanner = new Scanner(System.in);

        System.out.print("Write text: ");
        String text = scanner.nextLine();

        System.out.print("Write position: ");
        int index = scanner.nextInt();

        // validate IF that index it is inside text bonds (0 and text total length)
        if (index >= 0 && index <= text.length() - 1) {
            String textFromGivenIndex = text.substring(index);
            System.out.println("New text is: " + textFromGivenIndex);
        }
        else {
            System.out.println("Index is outside text length");
        }


    }
}
