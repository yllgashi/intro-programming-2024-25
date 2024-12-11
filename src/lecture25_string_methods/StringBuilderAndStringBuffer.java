package lecture25_string_methods;

public class StringBuilderAndStringBuffer {
    public static void main(String[] args) {
        // String is immutable
        String textInString = "abc";
        textInString += "def";
        textInString += "ghj";
        textInString += "filan";
        textInString += "fisteku";
        textInString += "cacttus";
        textInString += "Kosova";
        // after many lines of code like this we will get "memory leaked" error


        // StringBuilder is NOT immutable
        // StringBuilder => Use StringBuilder if you will change text value for more than one-time (it will save the memory)
        StringBuilder textInStringBuilder = new StringBuilder();
        textInStringBuilder.append("abc");
        textInStringBuilder.append("def");
        textInStringBuilder.append("ghj");

        // StringBuffer is NOT immutable
        // StringBuffer
        StringBuffer textInStringBuffer = new StringBuffer();
        textInStringBuffer.append("abc");
        textInStringBuffer.append("def");
        textInStringBuffer.append("ghj");
    }
}
