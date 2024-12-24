package lecture27_for;

public class PrintNumberFromOneToTen {
    public static void main(String[] args) {
        // sequential
        System.out.println("Number: " + 1);
        System.out.println("Number: " + 2);
        System.out.println("Number: " + 3);
        System.out.println("Number: " + 4);
        System.out.println("Number: " + 5);
        System.out.println("Number: " + 6);
        System.out.println("Number: " + 7);
        System.out.println("Number: " + 8);
        System.out.println("Number: " + 9);
        System.out.println("Number: " + 10);

        for (int counter = 0; counter < 10; counter++) {
            System.out.println("Number: " + (counter + 1));
        }
    }
}
