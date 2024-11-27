package lecture19_math;

public class MathExample {
    public static void main(String[] args) {

        // abs => it gives always positive value of that number
        int absOfTen = Math.abs(10);
        System.out.println(absOfTen);

        int absOfMinusTen = Math.abs(-10);
        System.out.println(absOfMinusTen);






        // max => It will give to us maximum value of two numbers which are provided
        System.out.println(     Math.max(10, 20)     );
        System.out.println(     Math.max(20, 10)    );





        // min => It will give to us minimum value of two numbers which are provided
        System.out.println(     Math.min(10, 20)     );
        System.out.println(     Math.min(20, 10)    );







        // sin
        System.out.println(Math.sin(0.8));
        System.out.println(Math.sin(0.5));




        /// cos
        System.out.println(Math.cos(0.8));
        System.out.println(Math.cos(0.5));







        // tan
        System.out.println(Math.tan(0.8));
        System.out.println(Math.tan(0.5));





        // exp
        System.out.println(Math.exp(10.5));



        // log
        System.out.println(Math.log(50));




        // pow
        Math.pow(4, 2);
        Math.pow(4, 10);




        // round
        Math.round(3.1);
        Math.round(3.9);






        // random
        System.out.println(Math.random());






        // sqrt => Square root
        System.out.println(Math.sqrt(16));



        // E
        System.out.println(Math.E);



        // PI
        System.out.println(Math.PI);
    }
}
