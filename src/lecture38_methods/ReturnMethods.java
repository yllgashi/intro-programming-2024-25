package lecture38_methods;

public class ReturnMethods {
    public static void main(String[] args) {

    }

    public static void printSomething() {
        if (1 == 1) {
            System.out.println("Hello world");
            return;
        }
        System.out.println("test"); // unreachable code (because if-condition is always true and code will terminate on "return"
    }
}
