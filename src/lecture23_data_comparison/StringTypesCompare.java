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

        // inside if-condition
//        'a' + 'b' + 'c' == 'A' + 'B' + 'C'
//        if("abc".equals("ABC")) {
//            // ...
//        }




        // negative number => text one is smaller than text two
        // 0 => text one is equal with text two
        // positive number => text one in bigger than text two
        int compareResultTwo = "ABC".compareTo("ABC");
        System.out.println(compareResultTwo);

        if(compareResultTwo < 0) {
            System.out.println("Text one is smaller than text two");
        }
        else if(compareResultTwo > 0) {
            System.out.println("Text one is bigger than text two");
        }
        else {
            System.out.println("Text one is equal with text one");
        }
    }
}
