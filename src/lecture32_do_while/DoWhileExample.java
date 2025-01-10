package lecture32_do_while;

public class DoWhileExample {
    public static void main(String[] args) {
        // do-while

        // in do-while statement we are sure that the scope "{}" will be exceeded once
        // after first-iteration then the condition will be checked if there can be next iterations (or not)

        do {
            System.out.println("Hello there");
        } while (1 == 2);

        System.out.println("Application ended...");
    }
}
