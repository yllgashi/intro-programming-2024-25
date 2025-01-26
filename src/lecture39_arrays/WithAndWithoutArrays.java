package lecture39_arrays;

public class WithAndWithoutArrays {
    public static void main(String[] args) {
        // 1. Save five market products (product names and product prices)

        // without arrays
        String productName1 = "Coca Cola";
        double productPrice1 = 1.5;

        String prodcutName2 = "Milk";
        double productPrice2 = 3.5;

        String productName3 = "Soda";
        double productPrice3 = 4;

        String prodcutName4 = "Cheese";
        double productPrice4 = 0.20;

        String prodcutName5 = "Salt";
        double productPrice5 = 4.50;



        // with arrays
        String[] productNames = new String[5];
        double[] productPrices = new double[5];

        productNames[0] = "Coca Cola";
        productPrices[0] = 1.5;

        productNames[1] = "Milk";
        productPrices[1] = 3.5;

        productNames[2] = "Soda";
        productPrices[2] = 4;

        productNames[3] = "Cheese";
        productPrices[3] = 0.20;

        productNames[4] = "Salt";
        productPrices[4] = 4.50;
    }
}
