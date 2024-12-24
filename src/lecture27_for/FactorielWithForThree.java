package lecture27_for;

public class FactorielWithForThree {
    public static void main(String[] args) {
        int numberWhichWeWantToCalculateFactoriel = 5;

        int productOfFactories = 1;

        for (int i = 1; i <= numberWhichWeWantToCalculateFactoriel; i++) {
            productOfFactories = productOfFactories * i;
        }

        System.out.println("Product of factoriel of 5 is: " + productOfFactories);
    }
}
