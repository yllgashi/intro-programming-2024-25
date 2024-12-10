package lecture24_switch;

public class SwitchExample {
    public static void main(String[] args) {

        // 1 => green
        // 2 => red
        // 3 => yellow
        int semaphoreColorCode = 5;

        switch (semaphoreColorCode) {
            case 1:
                System.out.println("Semaphore color is green");
                System.out.println("Tik tak...");
                break;
            case 2:
                System.out.println("Semaphore color is red");
                System.out.println("Tik tak...");
                break;
            case 3:
                System.out.println("Semaphore color is yellow");
                System.out.println("Tik tak...");
                break;
            default:
                System.out.println("Semaphore is broken");
                break;
        }

        // switch => do something different in different scenarios
        // case => manage a specific scenario
        // default => manage all un-managed scenarios


        System.out.println("Application ended...");
    }
}
