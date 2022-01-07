package uebung05;

public class MethodsB {
    public static void main(String[] args) {
        // testing my double-method "product" with an array numbers
        double[] values = new double[] {1.0, 2.0, 3.3, 4.0};
        System.out.println(product(values)); //24.0
    }
    public static double product(double[] values){
        //calculate the product of values with the help of a foreach-loop
        double product = 1;
        for (double i : values){
            product *= i;
        }
        return product;
    }

}
