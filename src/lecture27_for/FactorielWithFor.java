package lecture27_for;

public class FactorielWithFor {
    public static void main(String[] args) {

        // factories of number 5
        int factoriesOfFive = 1;

        for (int i = 5; i >= 1; i--) {
            System.out.println("We are finding product with: " + i);
            factoriesOfFive = factoriesOfFive * i;
        }

        System.out.println("Factoriel of number 5 is: " + factoriesOfFive);


        System.out.println("Factoriel of number 5 is: " + (5 * 4 * 3 * 2 * 1));
    }
}
