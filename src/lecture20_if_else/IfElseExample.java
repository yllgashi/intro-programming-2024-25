package lecture20_if_else;

public class IfElseExample {
    public static void main(String[] args) {
        // in case that the semaphore light is "green" you can walk
        // in other cases you cannot walk

        String semaphoreColor = "green";
        // String semaphoreColor = "red";


        if(semaphoreColor == "green") {
            System.out.println("You CAN walk...");
        }
        else {
            System.out.println("You CANNOT walk...");
        }
    }
}
