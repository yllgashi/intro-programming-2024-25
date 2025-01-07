package lecture29_for_exercise;

import java.util.Scanner;

public class FindAverageFor {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("********Calculate Average********");
        System.out.println();

        Scanner scanner = new Scanner(System.in);

        int totalCourses = 10;
        int gradesSum = 0;

        // find total grade sum of all courses
        for (int i = 1; i <= totalCourses; i++) {
            System.out.println("Grade " + i + ": ");
            int grade = scanner.nextInt();
            gradesSum = gradesSum + grade;
        }

        double average = (double) gradesSum / totalCourses;
    }
}
