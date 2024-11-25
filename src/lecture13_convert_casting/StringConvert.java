package lecture13_convert_casting;

public class StringConvert {
    // convert from String to other data types
    byte a = Byte.parseByte("10");
    short b = Short.parseShort("100");
    int c = Integer.parseInt("10000");
    long d = Long.parseLong("100000000");
    double f = Double.parseDouble("10000000");


    // convert from other data types to String
    String e = String.valueOf(10); // "10"
    String h = String.valueOf(3.14); // "3.14"
}
