package lecture22_if_else_exercises;

public class FlipCoin {
    public static void main(String[] args) {
        // we are generating a random value which is unique each time we execute...
        // from 0.0 to 0.9999...
        double randomValue = Math.random();

        if(randomValue > 0.5) {
            System.out.println("Heads");
        }
        else {
            System.out.println("Tails");
        }
    }
}
