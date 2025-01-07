package lecture30_while;

public class WhileExample {
    public static void main(String[] args) {

        // I am specifying the while condition such at it will be
        // executed until this counter (howManyTimesDidIEnterTheWhileStatement)
        // is smaller than ten (or in other words until there are 10 executions)

        // each time we iterate in while body we are incrementing
        // "howManyTimesDidIEnterTheWhileStatement" by one

        int howManyTimesDidIEnterTheWhileStatement = 0;

        while (howManyTimesDidIEnterTheWhileStatement < 10) {
            System.out.println("I am printing something");
            howManyTimesDidIEnterTheWhileStatement++;
        }
    }
}
