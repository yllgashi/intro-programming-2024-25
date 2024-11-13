package lecture11_inputs;

import java.util.Scanner;

public class ScannerThirdExample {
    public static void main(String[] args) {
        Scanner toolToGetInputFromUser = new Scanner(System.in);

        // .nextBoolean()
        System.out.print("Write a boolean: ");
        boolean booleanFromKeyword = toolToGetInputFromUser.nextBoolean();

        // .nextInt()
        System.out.print("Write an int: ");
        int intFromKeyword = toolToGetInputFromUser.nextInt();

        // .nextLong()
        System.out.print("Write a long: ");
        long longFromKeyword = toolToGetInputFromUser.nextLong();

        // .nextDouble()
        System.out.print("Write a dobule: ");
        double doubleFromKeyword = toolToGetInputFromUser.nextDouble();

        // .nextLine()
        System.out.print("Write a line: ");
        toolToGetInputFromUser.nextLine();
        String stringFromKeyword = toolToGetInputFromUser.nextLine();


        // print values
        System.out.println(booleanFromKeyword);
        System.out.println(intFromKeyword);
        System.out.println(longFromKeyword);
        System.out.println(doubleFromKeyword);
        System.out.println(stringFromKeyword);
    }
}
