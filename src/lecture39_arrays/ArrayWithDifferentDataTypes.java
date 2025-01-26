package lecture39_arrays;

public class ArrayWithDifferentDataTypes {
    public static void main(String[] args) {
        // array of string, int, char and double
        String[] users = new String[5];
        int[] userAges = new int[5];
        char[] userGender = new char[5];
        double[] userHeights = new double[5];

        // initialize
        users[0] = "filanfisteku";
        userAges[0] = 45;
        userGender[0] = 'M';
        userHeights[0] = 2.30;

        users[1] = "ibrahimetatlises";
        userAges[1] = 50;
        userGender[1] = 'F';
        userHeights[1] = 1.50;

        // show information from different array-data-types
        System.out.println("Username: " + users[0]);
        System.out.println("Age: " + userAges[0]);
        System.out.println("Gender: " + userGender[0]);
        System.out.println("Height: " + userHeights[0]);

        System.out.println("Username: " + users[1]);
        System.out.println("Age: " + userAges[1]);
        System.out.println("Gender: " + userGender[1]);
        System.out.println("Height: " + userHeights[1]);
    }
}
