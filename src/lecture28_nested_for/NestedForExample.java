package lecture28_nested_for;

public class NestedForExample {
    public static void main(String[] args) {
        // outer for
        for (int i = 1; i <= 3; i++) {
            System.out.println("i = " + i);

            // inner for
            for (int j = 1; j <= 2; j++) {
                System.out.println(" j = " + j);
            }

        }
    }
}
