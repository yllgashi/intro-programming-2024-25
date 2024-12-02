package lecture18_operators_exercise;

import java.util.Scanner;

public class BitwiseOperatorsExercise {
    public static void main(String[] args) {
        // 1. Shkruani një program Java që merr dy numra të plotë si hyrje
        // nga përdoruesi dhe kryen një operacion AND dhe një operacion OR në bit. Shfaq rezultatet.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Number one: ");
        int numberOne = scanner.nextInt();

        System.out.print("Number two: ");
        int numberTwo = scanner.nextInt();

        int andResult = numberOne & numberTwo;
        int orResult = numberOne | numberTwo;

        System.out.println(numberOne + " AND " + numberTwo + " = " + andResult);
        System.out.println(numberOne + " OR " + numberTwo + " = " + orResult);








        // 2. Krijoni një program që merr një numër të plotë si hyrje dhe
        // kryen ndërrime bit majtas dhe djathtas në të. Lejo përdoruesin
        // të përcaktojë numrin e pozicioneve për të zhvendosur. Printoni rezultatet.

        System.out.print("Number to shift: ");
        int numberToShift = scanner.nextInt();

        System.out.print("How many positions to shift: ");
        int positionsToShift = scanner.nextInt();

        int shiftRightResult = numberToShift >> positionsToShift;
        int shiftLeftResult = numberToShift << positionsToShift;

        System.out.println(numberToShift + " >> " + positionsToShift + " = " + shiftRightResult);
        System.out.println(numberToShift + " << " + positionsToShift + " = " + shiftLeftResult);
    }
}




