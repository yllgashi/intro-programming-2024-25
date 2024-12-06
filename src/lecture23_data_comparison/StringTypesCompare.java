package lecture23_data_comparison;

public class StringTypesCompare {
    public static void main(String[] args) {
        String textOne = "abc";
        String textTwo = "abc";

        // not the best practice
        if(textOne == textTwo) {
            System.out.println("Texts are the same");
        }
        else {
            System.out.println("Texts are not the same");
        }

        // best practice
        if(textOne.equals(textTwo)) {
            System.out.println("Texts are the same");
        }
        else {
            System.out.println("Texts are not the same");
        }


        // .equals()
        boolean areTextsEquals = textOne.equals("abc");
    }
}
