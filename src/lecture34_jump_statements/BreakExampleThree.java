package lecture34_jump_statements;

public class BreakExampleThree {
    public static void main(String[] args) {
        String word = "Kosovarepublikedheshtetipavarur"; // is not palindrome

        int totalWordLength = word.length(); // 5
        boolean isPalindrome = true;

        for (int i = 0; i < totalWordLength / 2; i++) {
            if (word.charAt(i) != word.charAt(totalWordLength - (i + 1))) {
                isPalindrome = false;
                break; // this will increase application performance
            }
        }

        System.out.println("Is palindome? " + isPalindrome);
    }
}
