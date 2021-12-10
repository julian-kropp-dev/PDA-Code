public class GrossuebungII{
    public static double median(double[] values){
        if (values.length % 2 == 0) return ((values[(values.length / 2) - 1] + values[values.length / 2]) / 2);
        else return (values[values.length / 2]);
    }
    public static void main(String[] args) {
        double [] numbers = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(median(numbers));

    }
}
