package lecture20_if_else;

import java.util.Scanner;

public class IfElseIfElseSecondExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Number one: ");
        int numberOne = scanner.nextInt();

        if(numberOne > 0) {
            System.out.println("Positive number");
        }
        else if(numberOne < 0) {
            System.out.println("Negative number");
        }
        else {
            System.out.println("Number is zero - 0 ");
        }
    }
}
