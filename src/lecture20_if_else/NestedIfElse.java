package lecture20_if_else;

public class NestedIfElse {
    public static void main(String[] args) {
        String semaphoreColor = "green";
        int carsInTheRoad = 2;

        if (semaphoreColor == "green") {
            if (carsInTheRoad == 0) {
                System.out.println("Kalo, asnje veture ne rruge");
            } else {
                System.out.println("Mos kalo, drita eshte e gjelbert mirepo ka vetura me shpejtesi ne rruge");
            }
        } else {
            if(carsInTheRoad == 0) {
                System.out.println("Kalo mirepo rrezikun mbaje mbi vete");
            }
            else {
                System.out.println("Mos kalo, drita eshte e kuqe gjithashtu ka vetura ne rruge");
            }
        }
    }
}
