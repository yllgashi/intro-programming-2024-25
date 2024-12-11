package lecture25_string_methods;

public class StringExample {
    public static void main(String[] args) {
        // primitive type
        int number = 10; // 32 bit
        number = 20; // we are using the same location in memory (32bit), we are just changing its value




        // object (it is immutable) => we cannot change its value, we just create another string in memory
        String text = "abc";
        text = "def";

        // is the same as:
        // String text = "abc"; // create a location in memory where "abc" will be stored
        // leave "abc" in memory
        // create new variable "String text" with value of "def"


        // another way of creating string
        String anotherText = new String("Filan Fisteku");
    }
}
