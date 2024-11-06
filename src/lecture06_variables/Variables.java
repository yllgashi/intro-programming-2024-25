package lecture06_variables;

public class Variables {
    public static void main(String[] args) {
        // variable declarations and initializations;
        byte myByte = 1;
        short myShort = 10;
        int myInt = 20;
        long myLong = 50L;
        float myFloat = 3.14F;
        double myDouble = 3.14;
        char myChar = 'A';
        boolean myBoolean = true;

        // print values
        System.out.println(myByte); // 1
        System.out.println(myShort); // 10
        System.out.println(myInt); // 20
        System.out.println(myLong); // 50
        System.out.println(myFloat); // 3.14
        System.out.println(myDouble); // 3.14
        System.out.println(myChar); // A
        System.out.println(myBoolean); // true

        // change value
        myByte = 2;
        myShort = 20;
        myInt = 30;
        myLong = 60L;
        myFloat = 3.15F;
        myDouble = 3.17;
        myChar = 'B';
        myBoolean = false;

        // print values
        System.out.println(myByte); // 2
        System.out.println(myShort); // 20
        System.out.println(myInt); // 30
        System.out.println(myLong); // 60
        System.out.println(myFloat); // 3.15
        System.out.println(myDouble); // 3.17
        System.out.println(myChar); // B
        System.out.println(myBoolean); // false
    }
}
