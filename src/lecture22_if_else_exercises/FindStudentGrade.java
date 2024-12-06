package lecture22_if_else_exercises;

import java.util.Scanner;

public class FindStudentGrade {
    public static void main(String[] args) {
        // we will find user grade based on total points he/she earned...

        // header
        System.out.println(".......Find Student Grade.......");
        System.out.println();

        // create scanner in order to get user input
        Scanner scanner = new Scanner(System.in);

        // ask for student total points
        System.out.print("Enter student points: ");
        int points = scanner.nextInt();

        // calculate student grade
        if(points >= 0 && points <= 49) {
            System.out.println("Grade is 5");
        }
        else if(points >= 50 && points <= 59) {
            System.out.println("Grade is 6");
        }
        else if(points >= 60 && points <= 69) {
            System.out.println("Grade is 7");
        }
        else if(points >= 70 && points <= 79) {
            System.out.println("Grade is 8");
        }
        else if(points >= 80 && points <= 89) {
            System.out.println("Grade is 9");
        }
        else if(points >= 90 && points <= 100) {
            System.out.println("Grade is 10");
        }
        else {
            System.out.println("Invalid points... Try again");
        }


        // footer
        System.out.println();
        System.out.println(".......Application ended.......");
    }
}
