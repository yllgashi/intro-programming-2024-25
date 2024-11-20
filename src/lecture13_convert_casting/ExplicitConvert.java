package lecture13_convert_casting;

public class ExplicitConvert {
    public static void main(String[] args) {
        // (data_type) => CAST

        // first case
        int a = 100; // 32bit
        byte b = (byte) a; // 8bit

        System.out.println(a); // 100
        System.out.println(b); // 100


        // another case
        int c = 10_000_000; // 32bit
        byte d = (byte) c; // 8bit

        System.out.println(c); // 10000000
        System.out.println(d); // ???




        // from floating-point number to integer number
        float e = 3.14F;
        int f = (int)e;

        System.out.println(e);
        System.out.println(f);
    }
}
