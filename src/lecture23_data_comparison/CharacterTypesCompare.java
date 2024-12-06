package lecture23_data_comparison;

public class CharacterTypesCompare {
    public static void main(String[] args) {
        char charOne = 'A';
        char charTwo = '7';

        if (charOne == charTwo) {
            System.out.println("Characters are equals");
        } else {
            System.out.println("Characters are NOT equals");
        }

        // 'A' => 65 (65 is order-number of ASCII code)
        if(charOne == 65) {
            System.out.println("Char 'A' is equal with 65 from ASCII");
        }
        else {
            System.out.println("Char 'A' is NOT equal with 65 from ASCII");
        }

        // is a character a number??
        if(charTwo >= '0' && charTwo <= '9') {
            System.out.println("Character is a number");
        }
        else {
            System.out.println("Character is NOT a number");
        }
    }
}
