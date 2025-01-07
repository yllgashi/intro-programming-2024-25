package lecture29_for_exercise;

public class ReverseStringWithFor {
    public static void main(String[] args) {
        // Filan
        // naliF
        String text = "Filan";


        System.out.println("Characters without reverse: ");
        // print without reversing
        for (int i = 0; i < text.length(); i++) {
            System.out.print(text.charAt(i) + " ");
        }

        System.out.println();
        System.out.println("Characters with reverse: ");
        // print reversing
        for (int i = text.length() - 1; i >= 0; i--) {
            System.out.print(text.charAt(i) + " ");
        }
    }
}
