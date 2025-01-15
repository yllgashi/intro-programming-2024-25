package lecture37_debug;

import java.util.Scanner;

public class DebugCodeExample {
    public static void main(String[] args) {
        // find palindrome


        // 1. find bugs in this code

        // syntax bug
        // String word = scanner.nextLine();
        // Scanner scanner = new Scanner(System.in);
        // for (int i = 0; i < word.length() / 2; i++)
        //     if (word.charAt(i) != word.charAt(word.length() - (i + 1))) {
        //         isPalindrome = false;
        //     }
        // }
        // boolean isPalindrome = true;
        // System.out.println("Is palindrome? " + isPalindrome);
        // }

        // fix syntax bug
        // Scanner scanner = new Scanner(System.in);
        //
        // System.out.print("Write a word: ");
        // String word = scanner.nextLine();
        //
        // boolean isPalindrome = true;
        //
        // for (int i = 0; i < word.length() / 2; i++) {
        //     if (word.charAt(i) != word.charAt(word.length() - (i + 1))) {
        //         isPalindrome = false;
        //     }
        // }
        // System.out.println("Is palindrome? " + isPalindrome);


        // 2. Logic bugs
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Write a word: ");
//        String word = scanner.nextLine();
//
//        boolean isPalindrome = true;
//
//        for (int i = 0; i < word.length() / 2; i++) {
//            if (word.charAt(i) != word.charAt(word.length() - (i + 1))) {
//                isPalindrome = false;
//            }
//        }
//        System.out.println("Is palindrome? " + isPalindrome);


        // 3. Find things we have to make for application performance improvements
        Scanner scanner = new Scanner(System.in);

        System.out.print("Write a word: ");
        String word = scanner.nextLine();

        boolean isPalindrome = true;

        for (int i = 0; i < word.length() / 2; i++) {
            if (word.charAt(i) != word.charAt(word.length() - (i + 1))) {
                isPalindrome = false;
                break; // break the loop in order to increase performance (only for some cases)
            }
        }
        System.out.println("Is palindrome? " + isPalindrome);
    }

}
