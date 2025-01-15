package lecture38_methods;

public class MethodSignature {
    public static void main(String[] args) {
        // method call
        printFirstAndLastName();

        // reuse same block of code
        printFirstAndLastName();
        printFirstAndLastName();
        printFirstAndLastName();
    }

    // method declaration (create a block of code which will do ONLY one job)
    public static void printFirstAndLastName() {
        System.out.println("Filan Fisteku");
    }
}
