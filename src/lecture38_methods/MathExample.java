package lecture38_methods;

public class MathExample {
    public static void main(String[] args) {
        // create some math methods same as Math.pow(4, 2)
        int res1 = sum(1, 2);
        int res2 = sub(3, 2);
        long res3 = produce(10, 5);
        double res4 = divide(10, 2);
        int res5 = findMaxNumber(10, 20);

        // we use same methods more than once
        int res6 = sum(10, 20);
        int res7 = sub(5, 1);
        long res8 = produce(5, 2);
        double res9 = divide(20, 5);
        int res10 = findMaxNumber(100, 200);
    }

    public static int sum(int x, int y) {
        int result = x + y;
        return result;
    }

    public static int sub(int x, int y) {
        int result = x - y;
        return result;
    }

    public static long produce(int x, int y) {
        long result = (long) x * y;
        return result;
    }

    public static double divide(int x, int y) {
        double result = (double) x / y;
        return result;
    }

    public static int findMaxNumber(int x, int y) {
        if (x > y) {
            return x;
        } else {
            return y;
        }
    }
}
