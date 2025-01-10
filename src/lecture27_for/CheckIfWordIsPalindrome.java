package lecture27_for;

public class CheckIfWordIsPalindrome {
    public static void main(String[] args) {
        String word = "kimik";

        // char at index 0 should be same with chat at index word.length() - 1
        // char at index 1 should be same with char at index word.length() - 2
        // char at index 2 should be same with char at index word.length() - 3
        // ...

        int totalWordLength = word.length(); // 5
        boolean isPalindrome = true;

        for (int i = 0; i < totalWordLength / 2; i++) {
            if (word.charAt(i) != word.charAt(totalWordLength - (i + 1))) {
                isPalindrome = false;
            }
        }

        System.out.println("Is palindome? " + isPalindrome);

    }
}
