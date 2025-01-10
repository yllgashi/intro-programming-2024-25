package lecture27_for;

import java.util.Scanner;

public class FindVowelsAndConsonantsFromWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Write a sentence: ");
        String sentence = scanner.nextLine();

        int totalZanore = 0;
        int totalBashketingellore = 0;
        int totalShenjaTePikesimit = 0;
        int totalKaraktereTePanjohura = 0;

        int firstIndex = 0;
        int lastIndex = sentence.length() - 1;

        for (int index = 0; index <= lastIndex; index++) {
            char character = sentence.charAt(index);
            character = Character.toLowerCase(character);

            if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u') {
                totalZanore++;
            }
            else if (character == 'b' || character == 'c' || character == 'd' || character == 'f' || character == 'g'|| character == 'h'){
                totalBashketingellore++;
            }
            else if (character == '.' || character == ','){
                totalShenjaTePikesimit++;
            }
            else{
                totalKaraktereTePanjohura++;
            }
        }

        System.out.println("------------------------------------");
        System.out.println("Total zanore: " + totalZanore);
        System.out.println("Total bashketingellore: " + totalBashketingellore);
        System.out.println("Total shenja te pikesimit: " + totalShenjaTePikesimit);
        System.out.println("Total karaktere te panjohura: " + totalKaraktereTePanjohura);
    }
}
