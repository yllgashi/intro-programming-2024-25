package lecture38_methods;

public class MixedMethodCalling {
    public static void main(String[] args) {
        // 10 + 2 - 3
        int finalResult = calculateFormula(10, 2, 3);

        System.out.println("Final result is: " + finalResult);
    }

    public static int calculateFormula(int a, int b, int c) {
        int sum = sum(10, 2);
        int result = sub(sum, c);
        return result;
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int sub(int a, int b) {
        return a - b;
    }
}
