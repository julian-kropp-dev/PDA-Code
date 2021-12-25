package SumSmallestAndBiggestNumberOfAnArray;

public class addMinMax {

    public static void main(String[] args) {
        int[] array = new int[] {};
        int[] array2 = new int[] {1, 2, 3};
        int[] array3 = new int[] {1, 2, 3, 99, 3, 65};
        System.out.println(addMinMax(array));
        System.out.println(addMinMax(array2));
        System.out.println(addMinMax(array3));
    }

    public static int addMinMax(int[] values) {
        if (values.length == 0) {
            return 0;
        }

        int maxElement = Integer.MIN_VALUE;
        int minElement = Integer.MAX_VALUE;

        for (int value: values) {
            if (value < minElement) {
                minElement = value;
            }
            if (value > maxElement) {
                maxElement = value;
            }
        }

        return minElement + maxElement;
    }
}
