package lecture16_exercise;

public class ExchangeVariables {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        int temporaryVariable = a;

        a = b;
        b = temporaryVariable;

        System.out.println(a);
        System.out.println(b);
    }
}
