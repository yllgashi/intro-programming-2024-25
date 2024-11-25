package lecture15_wrapper_classes;

public class WrapperExample {
    public static void main(String[] args) {
        byte firstByte = 10;
        short firstShort = 20;
        int firstInt = 30;
        long firstLong = 40L;
        float firstFloat = 3.14F;
        double firstDouble = 3.14123123;
        char firstChar = 'A';
        boolean firstBoolean = true;
        String firstString = "Hello";

        // wrapper classes
        Byte.parseByte("10");
        Short.parseShort("20");
        Integer.parseInt("30");
        Long.parseLong("40");
        Float.parseFloat("3.14");
        Double.parseDouble("3.142141");
        Character.isDigit('A');
        Boolean.parseBoolean("true");
        String.valueOf("123");
    }
}
