package lecture13_convert_casting;

public class ImplicitConvert {
    public static void main(String[] args) {
        /*
            byte - 8bit
            short - 16bit
            int - 32bit
            long - 64bit
            float - ...
            double - ...
         */


        // byte
        // byte a = 127; // 8 bit => 0 1 1 1 1 1 1 1
        // short b = a; // 16 bit => 0 0 0 0 0 0 0 0 0 1 1 1 1 1 1 1
        // int c = a; // 32 bit
        // long d = a; //
        // float e = a;
        // double f = a;


        // short
        // short a = 30_000;
        // int b = a;
        // long c = a;
        // float d = a;
        // double f = a;


        // int
        // int a = 1_000_000;
        // long b = a;
        // float c = a;
        // double d = a;


        // long
        // long a = 1_000_000_000_000L;
        // float b = a;
        // double c = a;


        // float
        // float a = 3.14F;
        // double b = a;

        // double
        // double a = 3.14;
        // ...???


        // Implicit convert to String
        String a = "Text" + 1; // "Text" + "1"
        String b = "Text" + 3.14; // "Text" + "3.14"
    }
}
