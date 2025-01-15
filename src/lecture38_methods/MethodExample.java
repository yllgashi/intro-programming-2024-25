package lecture38_methods;

import java.util.Scanner;

public class MethodExample {
    public static void main(String[] args) {
        // in old way:

        // printo te dhenat e mia
//        System.out.println("Emri im eshte: Filan Fisteku");
//        System.out.println("Ditelindja ime eshte: 31-12-1980");
//        System.out.println("Vendlindja ime eshte: Kosove");
//        System.out.println("Shtetesia ime eshte: Kosovar");
//        System.out.println("Gjinia ime eshte: M");


        // printo te dhenat e shtetit tim
        // System.out.println("Kosova eshte republike e krijuar me: 17-02-2008");
        // System.out.println("Disa nga komunat e Kosoves jane: Ferizaj, Mitrovice, Gjilan, Gjakove, Peje, Prizren dhe Prishtine");







        // with methods

        // method  call
        printMyInformation();
        printMyCountryInformation();

    }

    // method declaration
    public static void printMyInformation() {
        System.out.println("Emri im eshte: Filan Fisteku");
        System.out.println("Ditelindja ime eshte: 31-12-1980");
        System.out.println("Vendlindja ime eshte: Kosove");
        System.out.println("Shtetesia ime eshte: Kosovar");
        System.out.println("Gjinia ime eshte: M");
    }

    // method declaration
    public static void printMyCountryInformation() {
        System.out.println("Kosova eshte republike e krijuar me: 17-02-2008");
        System.out.println("Disa nga komunat e Kosoves jane: Ferizaj, Mitrovice, Gjilan, Gjakove, Peje, Prizren dhe Prishtine");
    }
}



