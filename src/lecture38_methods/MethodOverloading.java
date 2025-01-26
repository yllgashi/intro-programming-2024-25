package lecture38_methods;

public class MethodOverloading {
    public static void main(String[] args) {
        // method overloading => when we create more than one method with the same name
        // in order to create methods with the same name we need to change parameters order, parameters-number or return-type
        // in other words we need to save each method signature

        int resutOne = sumNumbers();
        int resultTwo = sumNumbers(1, 2);
        int resultThree = sumNumbers(1, 2, 3);
        System.out.println(resutOne);




        // method overloading (methods with same name but different parameters)
        System.out.println("Hello world");
        System.out.println(10);
        System.out.println(3.14);
        System.out.println('A');
    }

    public static int sumNumbers() {
        return 1 + 2;
    }

    // we cannot create a method with same name, same return-type and same parameters
    // we have to make it different with other methods created
    // public static int sumNumbers() {
    //     return 10 + 20;
    // }

    // method overloading
    public static int sumNumbers(int numberOne, int numberTwo) {
        return 10 + 20;
    }

    public static int sumNumbers(int numberOne, int numberTwo, int numberThree) {
        return 10 + 20 + 30;
    }
}
