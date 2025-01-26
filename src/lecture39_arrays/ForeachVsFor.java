package lecture39_arrays;

public class ForeachVsFor {
    public static void main(String[] args) {
        String[] users = new String[5];

        users[0] = "Test1";
        users[1] = "Test2";
        users[2] = "Test3";
        users[3] = "Test4";
        users[4] = "Test5";

        // for
        for (int i = 0; i < users.length; i++) {
            System.out.println(users[i]);
        }

        // foreach
        for (String element : users) {
            System.out.println(element);
        }
    }
}
