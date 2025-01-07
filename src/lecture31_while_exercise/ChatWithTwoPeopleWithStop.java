package lecture31_while_exercise;

import java.util.Scanner;

public class ChatWithTwoPeopleWithStop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final String STOP_KEYWORD = "stop";
        String chatFromPersonOne = "";
        String chatFromPersonTwo = "";
        
        while (!(chatFromPersonOne.equals(STOP_KEYWORD) && chatFromPersonTwo.equals(STOP_KEYWORD))) {
            System.out.print("Person 1: ");
            chatFromPersonOne = scanner.nextLine();

            System.out.print("Person 2: ");
            chatFromPersonTwo = scanner.nextLine();
        }

        System.out.println("Chat ended");
    }
}
