package lecture38_methods;

public class MethodWIthParameters {
    public static void main(String[] args) {
        int resultOfSum1 = sumTwoNumbers(1, 3);
        System.out.println(resultOfSum1);

        int resultOfSum2 = sumTwoNumbers(10, 5);
        System.out.println(resultOfSum2);

        int resultOfSum3 = sumTwoNumbers(100, 90);
        System.out.println(resultOfSum3);
    }

    public static int sumTwoNumbers(int numberOne, int numberTwo) {
        int result = numberOne + numberTwo;
        return result;
    }
}
