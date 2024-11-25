package lecture14_random;

public class RandomExample {
    public static void main(String[] args) {
        // Returns a double value with a positive sign, greater than or equal to 0.0 and less than 1.0

        double randomValue = Math.random();
        System.out.println(randomValue);

        // first time we executed => 0.26511837797463533
        // second time we executed => 0.2822553545444161
        // third time we executed => 0.0403508183653325


        // how to get random number as int?
        double randomValueAsDouble = Math.random();
        int randomValueAsInt = (int) randomValueAsDouble; // in this case the result always will be 0 due to: x >= 0 and x < 1
        System.out.println(randomValueAsInt);


        // generate a random value which is bigger or equal to 0 and smaller than 50?
        int differentRandomValueAsInt = (int) (50 * randomValueAsDouble);
        System.out.println(differentRandomValueAsInt);
    }
}
