package uebung6;

public class Recursion {
    public static void main(String[] args) {
        stepSum(new int[]{2, 4, 1, 3, 7});
    }

    public static void stepSum(int[] array) {
        int[] sum = new int[array.length - 1];
        if (array.length > 1) {
            for (int i = 1; i < array.length; i++) {
                sum[i - 1] = array[i] + array[i - 1];
            }

            for (int j : sum) {
                System.out.print(j + " ");
            }
            System.out.println();
            stepSum(sum);
        }

    }
}