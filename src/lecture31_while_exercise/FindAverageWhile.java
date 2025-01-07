package lecture31_while_exercise;

import java.util.Scanner;

public class FindAverageWhile {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("********Calculate Average********");
        System.out.println();

//        WITHOUT WHILE/FOR
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Type grade 1: ");
//        int gradeOne = scanner.nextInt();
//
//        System.out.print("Type grade 2: ");
//        int gradeTwo = scanner.nextInt();
//
//        System.out.print("Type grade 3: ");
//        int gradeThree = scanner.nextInt();
//
//        System.out.print("Type grade 4: ");
//        int gradeFourth = scanner.nextInt();
//
//        System.out.print("Type grade 5: ");
//        int gradeFifth = scanner.nextInt();
//
//        // calculate
//        double average = (gradeOne + gradeTwo + gradeThree + gradeFourth + gradeFifth) / 5.00;
//
//        System.out.println("Average grade is: " + average);


//        WITH WHILE
        Scanner scanner = new Scanner(System.in);

        int totalCourses = 10;
        int countCourses = 0;
        int sumOfGrades = 0;

        while (countCourses < totalCourses) {
            countCourses++;
            System.out.print("Type grade " + countCourses + ": ");
            int grade = scanner.nextInt();
            sumOfGrades += grade;
        }

        // calculate average...
        double average = (double) sumOfGrades / totalCourses;

        System.out.println("Average is: " + average);
    }
}



