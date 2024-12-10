package lecture24_switch;

public class SwitchWarning {
    public static void main(String[] args) {
        // if we are not specifying "brake" foreach cases then
        // code will execute from matching-case until the end of switch statement

        // With other words:
        // code execution is switch it is from matching-case UNTIL first "break" or end.

        int semaphoreColorCode = 2;

        switch (semaphoreColorCode) {
            case 1:
                System.out.println("Color is green");
                System.out.println("Tik tak...");
            case 2:
                System.out.println("Color is red");
                System.out.println("Tik tak...");
            case 3:
                System.out.println("Color is yellow");
                System.out.println("Tik tak...");
            default:
                System.out.println("Semaphore is broken");
        }
    }
}
