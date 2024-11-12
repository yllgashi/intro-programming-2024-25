package lecture09_intro_arithmetic_operators;

public class IntroArithmeticOperators {
    public static void main(String[] args) {
        // +
        System.out.println(10 + 2); // 12
        System.out.println(10.5 + 2.2); // 12.7
        System.out.println('Y' + 'G'); // 160
        System.out.println("Yll" + "Gashi"); // YllGashi

        // -
        System.out.println(10 - 2); // 8
        System.out.println(10.5 - 2.2); // 8.3
        System.out.println('Y' - 'G'); // 18
        // System.out.println("Yll" - "Gashi"); // compile-error

        // *
        System.out.println(10 * 2);
        System.out.println(10.5 * 2.2);
        System.out.println('Y' * 'G');

        // /
        System.out.println(10 / 3); // only 3 (not 3.33333)
        System.out.println(10.5 / 2.2);
        System.out.println('Y' / 'G');

        // %
        System.out.println(9 % 2);
    }
}
