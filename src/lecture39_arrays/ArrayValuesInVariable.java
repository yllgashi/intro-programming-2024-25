package lecture39_arrays;

public class ArrayValuesInVariable {
    public static void main(String[] args) {
        // array declaration and initialization
        String[] users = new String[3];

        // initialize array containers
        users[0] = "filanfisteku";
        users[1] = "fisteku123";
        users[2] = "filan123";

        // print values
        System.out.println(users[0]);
        System.out.println(users[1]);
        System.out.println(users[2]);


        // we can store array information into specific data-type
        String user1 = users[0];
        String user2 = users[1];
        String user3 = users[2];
    }
}
