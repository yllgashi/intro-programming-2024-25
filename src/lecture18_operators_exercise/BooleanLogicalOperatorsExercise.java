package lecture18_operators_exercise;

import java.util.Scanner;

public class BooleanLogicalOperatorsExercise {
    public static void main(String[] args) {

        // 1. Shkruani një program që pyet përdoruesin për moshën e tij.
        // Përdorni operatorë logjikë për të kontrolluar nëse mosha
        // është brenda një intervali të vlefshëm (p.sh., midis 18 dhe 65).
        // Shfaq një mesazh që tregon nëse mosha është e vlefshme apo jo.

        Scanner scanner = new Scanner(System.in);

        System.out.print("User age: ");
        int age = scanner.nextInt();


        String isAgeValid = age >= 18 && age <= 65 ? "Age is valid" : "Age is invalid";

        System.out.println(isAgeValid);
    }
}
