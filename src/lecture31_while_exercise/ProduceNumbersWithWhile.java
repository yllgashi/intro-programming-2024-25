package lecture31_while_exercise;

public class ProduceNumbersWithWhile {
    public static void main(String[] args) {
        int production = 1;
        int counter = 0;

        while (counter <= 10) {
            counter++;
            production = production * counter;
        }

        System.out.println("Total production is: " + production);
    }
}
