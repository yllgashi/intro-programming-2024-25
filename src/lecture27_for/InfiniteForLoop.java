package lecture27_for;

public class InfiniteForLoop {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        // infinit loop
        for (int i = 0; true; i++) {
            System.out.println(i);
        }
    }
}
