package lecture11_inputs;

import java.io.IOException;

public class OldWayInput {
    public static void main(String[] args) throws IOException {
        int firstLetterOfUsername = System.in.read();
        int secondLetterOfUsername = System.in.read();

        System.out.println((char) firstLetterOfUsername);
        System.out.println((char) secondLetterOfUsername);

    }
}
