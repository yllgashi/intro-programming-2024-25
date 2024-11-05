package lecture02_prints;

public class PrintFExample {
    public static void main(String[] args) {
        // %s -> for text (string)
        // System.out.printf("FirstName: %s", "Yll");
        // System.out.printf("LastName: %s", "Gashi");
        // System.out.printf("FirstName: %s, LastName: %s", "Yll", "Gashi");

        // System.out.println();

        // %S -> for text in uppercase
        // System.out.printf("FirstName in uppercase %S", "yll");

        // %n -> for new line
        // System.out.printf("%n");


        // %d -> for digits
        // System.out.printf("My Age is: %d   %n", 50);

        // %f -> for numbers with floating point
        // System.out.printf("Distance between my house and cacttus is %f km    %n", 50.2);
        // System.out.printf("Distance between my house and cacttus is %.2f km    %n", 50.2);
        // System.out.printf("Distance between my house and cacttus is %10.2f km    %n", 50.2);
        // System.out.printf("Distance between my house and cacttus is %10.2f km    %n", 5012.2);
        // System.out.printf("Distance between my house and cacttus is %10.2f km    %n", 50125.2);



        // new



        // %n => new line
        System.out.printf("Hi my firstName is Filan%n");
        System.out.printf("Hi my lastName is Fisteku%n");

        // %s => text
        // %S => TEXT
        System.out.printf("Hi my firstname is %s%n", "Filan");
        System.out.printf("Hi my lastname is %S%n", "Fisteku");

        // %c => character
        // %C => CHARACTER
        System.out.printf("Hi my firstname starts with %c%n", 'f');
        System.out.printf("Hi my firstname starts with %C%n", 'f');

        // %d => digits
        System.out.printf("Hi my age is %d%n", 50);
        System.out.printf("Hi my distance between me and cacttus is %,d%n", 5000000);

        // %f => numbers with floating point
        System.out.printf("Hi my height is %f%n", 190.5);
        System.out.printf("Hi my height is %10.2f%n", 190.5);
    }
}
