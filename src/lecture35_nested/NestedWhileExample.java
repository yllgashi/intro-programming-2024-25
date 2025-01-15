package lecture35_nested;

public class NestedWhileExample {
    public static void main(String[] args) {

        int count1 = 1;

        // code inside outer-while will be executed 10 times
        while (count1 <= 10) {

            // code inside inner-while will be exuted 20 times foreach time outer-loop is executed
            int count2 = 1;
            while (count2 <= 20) {
                System.out.println("Here"); // 10 * 200 = 200times
                count2++;
            }

            count1++;
        }

    }
}
