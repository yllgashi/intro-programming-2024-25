package lecture12_excercise;

public class BeriTima {
    public static void main(String[] args) {
        int euro = 33;
        int cents = 16;

        // show me currencies which I have in pocket...
        int totalInCents = (euro * 100) + cents;

        System.out.println("Total cents: " + totalInCents);


        // show me currencies...
        System.out.println("20-euroshe - " + totalInCents / 2000);
        totalInCents = totalInCents % 2000;
        System.out.println("10-euroshe - " + totalInCents / 1000);
        totalInCents = totalInCents % 1000;
        System.out.println("5-euroshe - " + totalInCents / 500);
        totalInCents = totalInCents % 500;

        // ...

        System.out.println("10-cent - " + totalInCents / 10);
        totalInCents = totalInCents % 10;
        System.out.println("5-cent - " + totalInCents / 5);
        totalInCents = totalInCents % 5;
        System.out.println("2-cent - " + totalInCents / 2);
        totalInCents = totalInCents % 2;
        System.out.println("1-cent - " + totalInCents / 1);
        totalInCents = totalInCents % 1;

    }
}
