package uebung06;

public class AddingUpArrays {
    public static void main(String[] args) {
        int[] test1a = new int[] {};
        int[] test1b = new int[] { 1 };
        int[] test1c = new int[] { 1, 3, 5, 6, 8 };
        int[] test1d = new int[] { 1, 3, 5, 6, 8, 9};
        int[][] test2a = new int[][] {};
        int[][] test2b = new int[][] { { 1 } };
        int[][] test2c = new int[][] { { 1, 2, 3 }, { 4, 5 } };
        int[][][] test3 = new int[][][] {{{1,2},{2,2,3}},{{1,4},{3,2}}};

        System.out.println(arraySum1D(test1a));
        System.out.println(arraySum1D(test1b));
        System.out.println(arraySum1D(test1c));
        System.out.println(arraySum1D(test1d));
        System.out.println("------------");
        System.out.println(arraySum2D(test2a));
        System.out.println(arraySum2D(test2b));
        System.out.println(arraySum2D(test2c));
        System.out.println("------------");
        System.out.println(arraySum3D(test3));
        System.out.println("------------");
        System.out.println(average3D(test3));

    }
    public static int arraySum1D(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }
    public static int arraySum2D(int[][] numbers) {
        int sum = 0;
        for (int[] i: numbers){
            sum += arraySum1D(i);
        }
        return sum;
    }
    public static int arraySum3D(int[][][] numbers) {
        int sum = 0;
        for (int[][] number : numbers) {
            sum += arraySum2D(number);

            }
        return sum;
    }


    public static double average3D(int[][][] numbers) {
        float zaehler = 0;
            for (int [][] array2D : numbers){
                for (int [] array1D : array2D){
                    for (int i : array1D){
                        zaehler++;
                    }
                }
            }
            if (zaehler == 0) return 0;
            return ((1.0/ zaehler) * arraySum3D(numbers));

    }
}
