package lecture39_arrays;

public class ArrayExample {
    public static void main(String[] args) {
        // Create an application which will store 5 users (only usernames of users)

        // Array declaration and initialization
        String[] users = new String[5];

        // initialize values inside array
        users[0] = "filanfisteku";
        users[1] = "yllg";
        users[2] = "fistekufilan123";
        users[3] = "gashiy";
        users[4] = "fisteku12345";

        // read values from array
        System.out.println(users[0]);
        System.out.println(users[1]);
        System.out.println(users[2]);
        System.out.println(users[3]);
        System.out.println(users[4]);
    }
}
