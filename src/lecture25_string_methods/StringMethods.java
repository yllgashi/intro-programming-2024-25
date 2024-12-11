package lecture25_string_methods;

public class StringMethods {
    public static void main(String[] args) {
        String text = "Yll Gashi";
        // same with ['Y', 'l', 'l', ' ', 'G', 'a', 's', 'h', 'i']


        // charAt(int index) -> Get specific character in specific index (position starting by 0)
        char firstChar = text.charAt(0); // 'Y'
        char lastElement = text.charAt(8); // 'i'
        System.out.println(firstChar);
        System.out.println(lastElement);


        // length() -> Get string total characters number
        int textLength = text.length(); // 9
        System.out.println(textLength);


        // format() -> Format string (like printf)
        String formatedText = String.format("%s %S", "Yll", "Gashi");
        System.out.println(formatedText);


        // substring(int startingIndex) -> Give a new string from specific index
        String lastName = text.substring(4);
        System.out.println(lastName);

        // substring(int startingIndex, int endingIndex + 1)
        String onePartOfText = text.substring(4, 7 + 1);
        System.out.println(onePartOfText);

        // contains() -> Check if a character exists inside string
        boolean doesGashiExists = text.contains("Gashi");
        System.out.println(doesGashiExists);
    }
}





