package lecture35_nested;

public class NestedForExample {
    public static void main(String[] args) {
//        System.out.println("*****");
//        System.out.println("*****");
//        System.out.println("*****");
//        System.out.println("*****");
//        System.out.println("*****");
//        System.out.println("*****");
//        System.out.println("*****");

        int rows = 7;
        int columns = 5;

        for (int r = 1; r <= rows; r++) {
            for (int c = 1; c <= columns; c++) {
                System.out.print("*");
            }
            System.out.println();
        }


        System.out.println("####################");

//        System.out.println("*");
//        System.out.println("**");
//        System.out.println("***");
//        System.out.println("****");
//        System.out.println("*****");

        int rows2 = 5;
        for (int r = 1; r <= rows2; r++) {
            for (int c = 1; c <= r; c++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}




