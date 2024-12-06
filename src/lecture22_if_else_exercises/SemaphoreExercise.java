package lecture22_if_else_exercises;

import java.util.Scanner;

public class SemaphoreExercise {
    public static void main(String[] args) {
        // 1. Te shkruhet program semafori i cili pranon nje numer: nese numri
        // eshte 1 te shfaqet mesazhi semafori I kuq, nese numri eshte 2 semafori eshte I verdhe,
        // nese numri eshte 3 semafori eshte I gjelbert, nese numri eshte 4 semafori eshte duke blinkuar,
        // per numra tejere semafori nuk eshte I leshuar fare (mungon rryma)


        System.out.println("Welcome to Semaphore application...");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Shkruaj numrin e semaforit: ");
        int number = scanner.nextInt();

        if (number == 1) {
            System.out.println("Semafori i kuq");
        } else if (number == 2) {
            System.out.println("Semafori eshte i verdhe");
        } else if (number == 3) {
            System.out.println("Semafori eshte i gjelbert");
        } else if (number == 4) {
            System.out.println("Semafori eshte duke blinkuar");
        } else {
            System.out.println("Semafori nuk eshte i leshuar");
        }
    }
}
